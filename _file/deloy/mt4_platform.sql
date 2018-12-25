/*
Navicat MySQL Data Transfer

Source Server         : MT4_RUN
Source Server Version : 50638
Source Host           : 121.199.34.161:3306
Source Database       : mt4_platform

Target Server Type    : MYSQL
Target Server Version : 50638
File Encoding         : 65001

Date: 2018-05-23 13:29:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_admin
-- ----------------------------
DROP TABLE IF EXISTS `tbl_admin`;
CREATE TABLE `tbl_admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8 NOT NULL,
  `password` varchar(50) CHARACTER SET utf8 NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `login_token` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `last_time` timestamp NULL DEFAULT NULL,
  `super_admin` tinyint(1) NOT NULL DEFAULT '0',
  `ip` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `real_name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`) USING BTREE,
  UNIQUE KEY `username` (`username`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tbl_admin_user
-- ----------------------------
DROP TABLE IF EXISTS `tbl_admin_user`;
CREATE TABLE `tbl_admin_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_id` int(11) NOT NULL,
  `user_group_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`) USING BTREE,
  KEY `tbl_admin_user_admin_id` (`admin_id`) USING BTREE,
  KEY `user_group_id` (`user_group_id`) USING BTREE,
  CONSTRAINT `tbl_admin_user_admin_id` FOREIGN KEY (`admin_id`) REFERENCES `tbl_admin` (`id`) ON DELETE CASCADE,
  CONSTRAINT `tbl_admin_user_ibfk_1` FOREIGN KEY (`user_group_id`) REFERENCES `tbl_user_group` (`id`) ON DELETE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tbl_dictionary
-- ----------------------------
DROP TABLE IF EXISTS `tbl_dictionary`;
CREATE TABLE `tbl_dictionary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) DEFAULT NULL COMMENT '父id',
  `dic_key` varchar(255) DEFAULT NULL,
  `text` varchar(40) CHARACTER SET utf8 DEFAULT NULL COMMENT '描述',
  `value` varchar(20) CHARACTER SET utf8 DEFAULT '0',
  `rank` int(11) DEFAULT NULL COMMENT '排序',
  `flag` int(2) NOT NULL DEFAULT '1' COMMENT '0删除 1使用中',
  `editable` int(2) NOT NULL DEFAULT '1' COMMENT '1可以修改 0不可修改',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tbl_email
-- ----------------------------
DROP TABLE IF EXISTS `tbl_email`;
CREATE TABLE `tbl_email` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login_id` int(11) NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 NOT NULL,
  `server_type` int(1) NOT NULL,
  `status` int(255) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12158 DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tbl_group
-- ----------------------------
DROP TABLE IF EXISTS `tbl_group`;
CREATE TABLE `tbl_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `group_name` varchar(255) DEFAULT NULL COMMENT '组名',
  `default_leverage` int(11) DEFAULT NULL COMMENT '默认杠杆',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tbl_history
-- ----------------------------
DROP TABLE IF EXISTS `tbl_history`;
CREATE TABLE `tbl_history` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login_id` int(11) DEFAULT NULL COMMENT '用户id',
  `symbol` varchar(255) DEFAULT NULL COMMENT '交易品种',
  `digits` int(11) DEFAULT NULL COMMENT '(点)',
  `cmd` int(11) DEFAULT NULL COMMENT '订单类型',
  `volume` decimal(11,2) DEFAULT NULL COMMENT '手数',
  `open_time` datetime DEFAULT NULL COMMENT '订单开始时间',
  `open_reserv` decimal(11,5) DEFAULT NULL,
  `open_price` decimal(11,5) DEFAULT NULL COMMENT '订单开始价格',
  `sl` decimal(11,5) DEFAULT NULL COMMENT '停损',
  `tp` decimal(11,5) DEFAULT NULL COMMENT '止赢',
  `close_time` datetime DEFAULT NULL COMMENT '关闭时间',
  `close_price` decimal(11,5) DEFAULT NULL COMMENT '关闭价格',
  `profit` decimal(11,2) DEFAULT NULL COMMENT '盈利情况',
  `margin_rate` int(11) DEFAULT NULL COMMENT '押金比',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `storage` decimal(11,5) DEFAULT '0.00000' COMMENT '库存费(每天6点收取库存费）',
  `taxes` decimal(11,2) DEFAULT NULL COMMENT '税金',
  `commission` decimal(11,2) DEFAULT NULL COMMENT '手续费',
  `to_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=264 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tbl_login
-- ----------------------------
DROP TABLE IF EXISTS `tbl_login`;
CREATE TABLE `tbl_login` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `pwd` varchar(255) DEFAULT NULL COMMENT '密码',
  `group_name` varchar(255) DEFAULT NULL COMMENT '组id',
  `regdate` datetime DEFAULT NULL COMMENT '注册时间',
  `lastdate` datetime DEFAULT NULL COMMENT '上次登录时间',
  `laverage` int(11) DEFAULT NULL COMMENT '杠杆',
  `balance` decimal(20,5) DEFAULT '0.00000' COMMENT '账户金额',
  `login_token` varchar(100) DEFAULT NULL COMMENT '登陆TOKEN',
  `phonetype` int(1) DEFAULT NULL COMMENT '0：Androd  1:IOS',
  `pushstate` int(1) DEFAULT '0' COMMENT '推送状态0关闭1开启',
  `clientid` varchar(255) DEFAULT '',
  `token` varchar(255) DEFAULT NULL,
  `sercice_type` int(11) DEFAULT NULL COMMENT '1本地2测试3真实',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tbl_news
-- ----------------------------
DROP TABLE IF EXISTS `tbl_news`;
CREATE TABLE `tbl_news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `sec_title` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `title_img` varchar(500) CHARACTER SET utf8 DEFAULT NULL,
  `content` text CHARACTER SET utf8,
  `flag` int(1) NOT NULL DEFAULT '1' COMMENT '是否删除 0/否  1/是',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '结束时间',
  `create_time` datetime NOT NULL COMMENT '开始时间',
  `remark` varchar(50) CHARACTER SET utf8 DEFAULT NULL COMMENT '备注',
  `author` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=402 DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tbl_order
-- ----------------------------
DROP TABLE IF EXISTS `tbl_order`;
CREATE TABLE `tbl_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login_id` int(11) DEFAULT NULL COMMENT '用户id',
  `command` int(11) DEFAULT NULL COMMENT '订单类型',
  `margin` int(11) DEFAULT NULL,
  `digits` int(11) DEFAULT NULL COMMENT '点',
  `comment` varchar(400) DEFAULT NULL COMMENT '备注',
  `volume` decimal(11,2) DEFAULT NULL COMMENT '手数',
  `symbol` varchar(255) DEFAULT NULL COMMENT '交易品种',
  `price` decimal(11,5) DEFAULT NULL COMMENT '价格',
  `stoploss` decimal(11,5) DEFAULT NULL,
  `takeprofit` decimal(11,2) DEFAULT NULL,
  `storage` decimal(11,5) DEFAULT NULL COMMENT '库存费(每日6点收取手续费)',
  `expiration` datetime DEFAULT NULL COMMENT '截至时间',
  `taxes` decimal(11,2) DEFAULT NULL COMMENT '税金',
  `commission` decimal(11,2) DEFAULT NULL COMMENT '手续费',
  `from_id` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=297 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tbl_server
-- ----------------------------
DROP TABLE IF EXISTS `tbl_server`;
CREATE TABLE `tbl_server` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `server` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `status` int(1) NOT NULL DEFAULT '0',
  `type` varchar(10) NOT NULL DEFAULT 'demo',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tbl_service
-- ----------------------------
DROP TABLE IF EXISTS `tbl_service`;
CREATE TABLE `tbl_service` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(255) DEFAULT NULL COMMENT '服务器名',
  `service_desc` varchar(255) DEFAULT NULL COMMENT '服务器描述',
  `img` varchar(255) DEFAULT NULL COMMENT '服务器图片',
  `type` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1458 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tbl_symbol
-- ----------------------------
DROP TABLE IF EXISTS `tbl_symbol`;
CREATE TABLE `tbl_symbol` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `symbol` varchar(20) DEFAULT NULL,
  `final_value` int(11) DEFAULT NULL,
  `margin` int(11) DEFAULT NULL,
  `remark` varchar(20) DEFAULT NULL,
  `digits` int(11) DEFAULT NULL,
  `group_name` varchar(255) DEFAULT NULL,
  `symbol_desc` varchar(255) DEFAULT NULL COMMENT '交易品种描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=197 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tbl_symbol_group
-- ----------------------------
DROP TABLE IF EXISTS `tbl_symbol_group`;
CREATE TABLE `tbl_symbol_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `group_name` varchar(255) DEFAULT NULL,
  `symbol_type` varchar(255) DEFAULT NULL,
  `server_dec` varchar(255) DEFAULT NULL COMMENT '服务描述  1本地2模拟3真实',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tbl_use_symbol
-- ----------------------------
DROP TABLE IF EXISTS `tbl_use_symbol`;
CREATE TABLE `tbl_use_symbol` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login_id` int(11) DEFAULT NULL COMMENT 'loginid',
  `service_type` int(11) DEFAULT NULL COMMENT '服务器类型',
  `symbol` varchar(255) DEFAULT NULL COMMENT '交易品种',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107192 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tbl_user
-- ----------------------------
DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL COMMENT '用户名',
  `phone` varchar(64) NOT NULL COMMENT '手机号',
  `qqnum` varchar(512) NOT NULL COMMENT 'qq号',
  `email` varchar(100) NOT NULL COMMENT '余额',
  `login_name` varchar(10) DEFAULT NULL COMMENT '登录名',
  `login_pwd` varchar(10) NOT NULL COMMENT '登录密码',
  `login_token` varchar(100) DEFAULT NULL COMMENT '登陆TOKEN',
  `login_overtime` datetime DEFAULT NULL COMMENT '最后登陆时间',
  `flag` int(1) NOT NULL DEFAULT '1' COMMENT '是否删除 0/否  1/是',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '结束时间',
  `create_time` datetime NOT NULL COMMENT '开始时间',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `color` varchar(255) DEFAULT NULL,
  `from` varchar(255) DEFAULT 'MT4管理员' COMMENT '来源',
  `user_group_id` int(255) DEFAULT NULL COMMENT '用户组id',
  PRIMARY KEY (`id`),
  KEY `user_group_id` (`user_group_id`) USING BTREE,
  CONSTRAINT `tbl_user_ibfk_1` FOREIGN KEY (`user_group_id`) REFERENCES `tbl_user_group` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6103 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tbl_user_group
-- ----------------------------
DROP TABLE IF EXISTS `tbl_user_group`;
CREATE TABLE `tbl_user_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `group_name` varchar(255) CHARACTER SET utf8 NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tbl_version
-- ----------------------------
DROP TABLE IF EXISTS `tbl_version`;
CREATE TABLE `tbl_version` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL COMMENT '软件名称',
  `code` varchar(128) NOT NULL COMMENT '软件编号',
  `desc` varchar(500) DEFAULT NULL COMMENT '对当前版本的描述',
  `version_name` double(20,2) NOT NULL COMMENT '版本名称',
  `version_code` int(20) NOT NULL COMMENT '版本号',
  `url` varchar(500) NOT NULL COMMENT '下载路径',
  `flag` int(1) NOT NULL DEFAULT '1' COMMENT '0-删除',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_time` datetime NOT NULL,
  `is_must` int(1) NOT NULL DEFAULT '0' COMMENT '是否强制更新,0-否,1-是',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of tbl_version
-- ----------------------------
INSERT INTO `tbl_version` VALUES ('1', 'MT4Android', '000', 'MT4(Aandr)0.9版本', '0.90', '0', '', '1', '2018-01-04 17:46:16', '0000-00-00 00:00:00', '1');
INSERT INTO `tbl_version` VALUES ('2', 'MT4Android', '000', 'MT4(Aandr)1.0版本', '1.00', '0', '', '1', '2018-01-04 17:46:14', '0000-00-00 00:00:00', '1');
INSERT INTO `tbl_version` VALUES ('3', 'MT4Android', '000', 'MT4(Aandr)1.1版本：1：提升了服务器配置 2：优化用户体验', '1.10', '0', 'http://outpjjqk4.bkt.clouddn.com/MetaTrader4_1,1_J.apk', '1', '2018-01-04 17:47:42', '0000-00-00 00:00:00', '1');
