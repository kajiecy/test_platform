if (!com) {
    var com = new Object();
}
if (!com.qiniu) {
    com.qiniu = new Object();
}
com.qiniu.genToken = function (url, do_success) {
    var App = {
        //存储区域
        Bucket: "",
        //访问资源的路径
        LOOK_CNAME: "",
        //qiniu test account
        AK: "",
        SK: ""
    }
    /* utf.js - UTF-8 <=> UTF-16 convertion
     *
     * Copyright (C) 1999 Masanao Izumo <iz@onicos.co.jp>
     * Version: 1.0
     * LastModified: Dec 25 1999
     * This library is free. You can redistribute it and/or modify it.
     */
    /*
     * Interfaces:
     * utf8 = utf16to8(utf16);
     * utf16 = utf8to16(utf8);
     */
    var utf16to8 = function (str) {
        var out, i, len, c;
        out = "";
        len = str.length;
        for (i = 0; i < len; i++) {
            c = str.charCodeAt(i);
            if ((c >= 0x0001) && (c <= 0x007F)) {
                out += str.charAt(i);
            } else if (c > 0x07FF) {
                out += String.fromCharCode(0xE0 | ((c >> 12) & 0x0F));
                out += String.fromCharCode(0x80 | ((c >> 6) & 0x3F));
                out += String.fromCharCode(0x80 | ((c >> 0) & 0x3F));
            } else {
                out += String.fromCharCode(0xC0 | ((c >> 6) & 0x1F));
                out += String.fromCharCode(0x80 | ((c >> 0) & 0x3F));
            }
        }
        return out;
    }

    var utf8to16 = function (str) {
        var out, i, len, c;
        var char2, char3;
        out = "";
        len = str.length;
        i = 0;
        while (i < len) {
            c = str.charCodeAt(i++);
            switch (c >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    // 0xxxxxxx
                    out += str.charAt(i - 1);
                    break;
                case 12:
                case 13:
                    // 110x xxxx 10xx xxxx
                    char2 = str.charCodeAt(i++);
                    out += String.fromCharCode(((c & 0x1F) << 6) | (char2 & 0x3F));
                    break;
                case 14:
                    // 1110 xxxx 10xx xxxx 10xx xxxx
                    char2 = str.charCodeAt(i++);
                    char3 = str.charCodeAt(i++);
                    out += String.fromCharCode(((c & 0x0F) << 12) | ((char2 & 0x3F) << 6) | ((char3 & 0x3F) << 0));
                    break;
            }
        }
        return out;
    }

    /*
     * Interfaces:
     * b64 = base64encode(data);
     * data = base64decode(b64);
     */
    var base64EncodeChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_";
    var base64DecodeChars = new Array(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63,
        52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
        15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
        41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1);

    var base64encode = function (str) {
        var out, i, len;
        var c1, c2, c3;
        len = str.length;
        i = 0;
        out = "";
        while (i < len) {
            c1 = str.charCodeAt(i++) & 0xff;
            if (i == len) {
                out += base64EncodeChars.charAt(c1 >> 2);
                out += base64EncodeChars.charAt((c1 & 0x3) << 4);
                out += "==";
                break;
            }
            c2 = str.charCodeAt(i++);
            if (i == len) {
                out += base64EncodeChars.charAt(c1 >> 2);
                out += base64EncodeChars.charAt(((c1 & 0x3) << 4) | ((c2 & 0xF0) >> 4));
                out += base64EncodeChars.charAt((c2 & 0xF) << 2);
                out += "=";
                break;
            }
            c3 = str.charCodeAt(i++);
            out += base64EncodeChars.charAt(c1 >> 2);
            out += base64EncodeChars.charAt(((c1 & 0x3) << 4) | ((c2 & 0xF0) >> 4));
            out += base64EncodeChars.charAt(((c2 & 0xF) << 2) | ((c3 & 0xC0) >> 6));
            out += base64EncodeChars.charAt(c3 & 0x3F);
        }
        return out;
    }

    var base64decode = function (str) {
        var c1, c2, c3, c4;
        var i, len, out;
        len = str.length;
        i = 0;
        out = "";
        while (i < len) {
            /* c1 */
            do {
                c1 = base64DecodeChars[str.charCodeAt(i++) & 0xff];
            } while (i < len && c1 == -1);
            if (c1 == -1) break;
            /* c2 */
            do {
                c2 = base64DecodeChars[str.charCodeAt(i++) & 0xff];
            } while (i < len && c2 == -1);
            if (c2 == -1) break;
            out += String.fromCharCode((c1 << 2) | ((c2 & 0x30) >> 4));
            /* c3 */
            do {
                c3 = str.charCodeAt(i++) & 0xff;
                if (c3 == 61) return out;
                c3 = base64DecodeChars[c3];
            } while (i < len && c3 == -1);
            if (c3 == -1) break;
            out += String.fromCharCode(((c2 & 0XF) << 4) | ((c3 & 0x3C) >> 2));
            /* c4 */
            do {
                c4 = str.charCodeAt(i++) & 0xff;
                if (c4 == 61) return out;
                c4 = base64DecodeChars[c4];
            } while (i < len && c4 == -1);
            if (c4 == -1) break;
            out += String.fromCharCode(((c3 & 0x03) << 6) | c4);
        }
        return out;
    }
    var safe64 = function (base64) {
        base64 = base64.replace(/\+/g, "-");
        base64 = base64.replace(/\//g, "_");
        return base64;
    };
    var uid = Math.floor(Math.random() * 100000000 + 10000000).toString() + ":" + new Date().getTime();
    var type = uid + url.substring(url.lastIndexOf("."), url.length);

    var put_policy = {
        scope: App.Bucket + ":" + type,
        deadline: new Date().getTime()
    }
    var put_policy = JSON.stringify(put_policy);
    //SETP 3
    var encoded = base64encode(utf16to8(put_policy));
    //SETP 4
    var hash = CryptoJS.HmacSHA1(encoded, App.SK);
    var encoded_signed = hash.toString(CryptoJS.enc.Base64);
    //SETP 5
    var upload_token = App.AK + ":" + safe64(encoded_signed) + ":" + encoded;
    /*
     token,存储空间，文件名称Key，访问的域名
     */
    do_success(upload_token, App.Bucket, type, App.LOOK_CNAME);
    
};
com.qiniu.mimeTypes = {
    img: [
        //{title : "flv files", extensions : "flv"}, // 限定flv后缀上传格式上传
        {title: "Image files", extensions: "jpg,gif,png"}//,  限定jpg,gif,png后缀上传
        //{title : "Zip files", extensions : "zip"} // 限定zip后缀上传
    ]
    , mp4: [
        {title : "mp4", extensions : "mp4"}, // 限定mp4后缀格式上传
    ]
}
com.qiniu.filters = {
    img: {
        max_file_size: '10mb'
        , prevent_duplicates: true//防止重复
        , mime_types: com.qiniu.mimeTypes.img
    }
    , mp4: {
        max_file_size: '20mb'
        , prevent_duplicates: true//防止重复
        , mime_types: com.qiniu.mimeTypes.mp4
    }
    , fujian: {
        max_file_size: '20mb'
        , prevent_duplicates: true//防止重复
    }
}

/**
 * 初始化 七牛的上传控件，利用的是form上传
 * @param browse_button 可以点击作为选择的元素ID
 * @param opt_{
    do_getuptoken: function (file_name, fun_ok) {
        //必须是同步请求,返回 fun_ok( 上传的uptoken,文件的名称（唯一）key,访问的域名cname ,存储的仓库名称 brunt );
        com.qiniu.genToken(file_name, fun_ok);
    }
    //添加文件之后
    ,do_filesadd: function (up, files) {
        plupload.each(files, function (file) {
            // 文件添加进队列后，处理相关的事情
            // 每个文件上传前，处理相关的事情
            if (!confirm('确定上传：' + file.name + '\n 文件大小:' + file.size + '')) {
                up.stop();
                up.removeFile(file.id);
            } else {
                up.start();
            }
        });
    }
    //完成之后
    , do_success: function (up, file, sourceLink) {
        //完成就自动移除队列中
         up.removeFile(file.id);
    }
    //进度条
    ,do_progress: function (bfb) {

    }
    //错误
    ,do_error:function (errTip, err) {
        console.log(errTip);
    }
    //上传之前
    ,do_beforup:function (up, file) {

    }
    //上传完成
    ,do_complete: function () {

    }
    //设置上传过滤器，默认是图片过滤器
    ,filter:com.qiniu.filters.img

 }
 * @returns {{start: start, stop: stop, refresh: refresh}}
 */
com.qiniu.init = function (browse_button, opt_) {
    var do_filesadd_ = opt_ ? opt_.do_filesadd : null;
    var do_getuptoken_ = opt_ ? opt_.do_getuptoken : null;
    var do_success_ = opt_ ? opt_.do_success : null;
    var do_beforup_ = opt_ ? opt_.do_beforup : null;
    var do_progress_ = opt_ ? opt_.do_progress : null;
    var do_complete_ = opt_ ? opt_.do_complete : null;
    var do_error_ = opt_ ? opt_.do_error : null;
    var filter_ = opt_ && opt_.filter ? opt_.filter : com.qiniu.filters.img;
    if (!do_getuptoken_) {
        console.error("do_getuptoken 回调缺失");
        return;
    }
    if(!do_filesadd_){
        console.error("do_filesadd 回调缺失");
        return;
    }
    var _now_key = null;
    var _cname = null;
    var _token = null;
    var _brunt = null;

    //引入Plupload 、qiniu.js后
    var upload = Qiniu.uploader({
        runtimes: 'html5,flash,html4',      // 上传模式，依次退化
        browse_button: browse_button,         // 上传选择的点选按钮，必需
        uptoken_func: function (file) {    // 在需要获取uptoken时，该方法会被调用
            var data = do_getuptoken_(file.name);

            _token = data.token;
            _now_key = data.key;
            _cname = data.cname;
            _brunt = data.brunt;

            // do something
            /*com.qiniu.genToken(file.name, function (token, brunt, key, cname) {
                _token = token;
                _now_key = key;
                _cname = cname;
                _brunt = brunt;
            });*/
            /*com.data.uploadInfo({
             type:type_
             ,name:file.name
             },function(data){
             _token=data.uptoken;
             _brunt=data.scope;
             _now_key=data.key;
             _cname=data.domain;
             },null,false);*/
            return _token;
        },
        get_new_uptoken: true,             // 设置上传文件的时候是否每次都重新获取新的uptoken
        domain: '<Your bucket domain>',     // bucket域名，下载资源时用到，必需
        //max_file_size: '10mb',             // 最大文件体积限制
        max_retries: 1,                     // 上传失败最大重试次数
        chunk_size: '0mb',                  // 分块上传时，每块的体积
        auto_start: false,                   // 选择文件后自动上传，若关闭需要自己绑定事件触发上传
        multi_selection: false,
        //container:browse_button,             //上传区域DOM ID，默认是browser_button的父元素
        //可以使用该参数来限制上传文件的类型，大小等，该参数以对象的形式传入，它包括三个属性：
        filters: filter_,
        init: {
            'FilesAdded': function (up, files) {
                /*plupload.each(files, function (file) {
                 // 文件添加进队列后，处理相关的事情
                 // 每个文件上传前，处理相关的事情
                 if (!confirm('确定上传：' + file.name + '\n 文件大小:' + file.size + '')) {
                 up.stop();
                 up.removeFile(file.id);
                 } else {
                 up.start();
                 }
                 });*/
                if (do_filesadd_) {
                    do_filesadd_(up, files);
                }
            }
            , 'BeforeUpload': function (up, file) {
                /*this_wt=plus.nativeUI.showWaiting("上传中...",{back:"close"});
                 up.stop();
                 up.removeFile(file.id);
                 }*/
                console.log("上传中...");
                if (do_beforup_) {
                    do_beforup_(up, file);
                }
            },
            'UploadProgress': function (up, file) {
                // 每个文件上传时，处理相关的事情
                // this_wt.setTitle("进度["+file.percent+"%]");
                console.log("进度[" + file.percent + "%]");
                if (do_progress_) {
                    do_progress_(file.percent);
                }
            },
            'FileUploaded': function (up, file, info) {
                // 每个文件上传成功后，处理相关的事情
                // 其中info是文件上传成功后，服务端返回的json，形式如：
                // {
                //    "hash": "Fh8xVqod2MQ1mocfI4S4KpRL6D98",
                //    "key": "gogopher.jpg"
                //  }
                // 查看简单反馈
                //var domain = up.getOption('domain');
                var res = JSON.parse(info);
                var sourceLink = _cname + res.key; //获取上传成功后的文件的Url
                if (do_success_) {
                    do_success_(up,file,sourceLink);
                }
                //完成就自动移除队列中
                // up.removeFile(file.id);
            },
            'Error': function (up, err, errTip) {
                console.error("Error:" + errTip);
                if (do_error_) {
                    do_error_(errTip, err);
                }
            },
            'UploadComplete': function () {
                console.info("UploadComplete");
                if (do_complete_) {
                    do_complete_();
                }
            },
            'Key': function (up, file) {
                // 若想在前端对每个文件的key进行个性化处理，可以配置该函数
                // 该配置必须要在unique_names: false，save_key: false时才生效
                return _now_key;
            }
        }
    });
    return {
        start:function () {
            upload.start();
        }
        ,stop: function () {
            upload.stop();
        }
        ,sel_file:function(){
            // upload.trigger('click',null);
            document.querySelector("#"+browse_button).click();
        }
        ,refresh: function () {
            upload.refresh();
        }
    }
}
