/**
 常用的js方法集
 必要依赖 jquery
 <script src="//cdn.bootcss.com/jquery/1.8.3/jquery.min.js"></script>
 */
if (!com) {
    var com = new Object();
}

if (!com.util) {
    com.util = new Object();
}

//-------------------------------------------util
com.util.hasClass = function (obj, cls) {
    return obj.className.match(new RegExp('(\\s|^)' + cls + '(\\s|$)'));
}
com.util.addClass = function (obj, cls) {
    if (!this.hasClass(obj, cls)) obj.className += " " + cls;
}
com.util.removeClass = function (obj, cls) {
    if (this.hasClass(obj, cls)) {
        var reg = new RegExp('(\\s|^)' + cls + '(\\s|$)');
        obj.className = obj.className.replace(reg, ' ');
    }
}
com.util.fileBase64Img = function (fileObj, fun_success) {
    // 创建一个FileReader对象
    var reader = new FileReader();
    // 绑定load事件
    reader.onload = function (e) {
//        fun_success(e.target.result);
        //压缩图片
        var img = new Image()
            , widthOrHeight = 640
            , quality = 0.7  //图像质量
            , canvas = document.createElement("canvas")
            , drawer = canvas.getContext("2d");
        img.src = this.result;
        if (img.height > img.width) {
            canvas.width = widthOrHeight * (img.width / img.height);
            canvas.height = widthOrHeight;
        } else {
            canvas.width = widthOrHeight
            canvas.height = widthOrHeight * (img.height / img.width);
        }

        drawer.drawImage(img, 0, 0, canvas.width, canvas.height);
        var d = canvas.toDataURL("image/jpeg", quality);
        fun_success(d);
    }
    // 读取File对象的数据
    var files = fileObj.files;
    if (files) {
        for (var i = 0; i < files.length; i++) {
            reader.readAsDataURL(files[i]);
        }
    }
}
//上传的图片需要处理
com.util.upB64 = function (srcB64) {
    if (!srcB64) {
        return srcB64;
    }
    //清除头部标记，不然服务端需要去除
    return srcB64.replace("data:image/jpeg;base64,", "")
        .replace("data:image/png;base64,","");
}
//解析jquery form  serializeArray 生成的数据
com.util.parseFormArray = function (formArr) {
    var subData = {};
    for (var i = 0; i < formArr.length; i++) {
        var name = formArr[i].name;
        subData[name] = formArr[i].value;
    }
    return subData;
}
/**
 * 格式化时间
 * @param date
 * @param format
 * @parma type def:date 是字符串格式  1：是时间搓
 * @returns {XML|string|void}
 */
com.util.formatDate = function (dateString, format, type) {
    if (!dateString) {
        return '';
    }
    var time = null;
    if (type && type == 1) {
        time = new Date(dateString);
    } else {
        var da = dateString.replace("年", "-").replace("月", "-")
            .replace("日", "").replace(/-/g, "/").split(/\/|\:|\ /);
        if (!format) format = "yyyy-MM-dd";
        if (!dateString)return "";
        var ss = "00";
        try {
            var xx = da[5];
            if (xx) {
                ss = xx;
            }
        } catch (e) {
        }
        time = new Date(da[0], da[1] - 1, da[2], da[3], da[4], ss);
    }

    var o = {
        "M+": time.getMonth() + 1, //月份
        "d+": time.getDate(), //日
        "H+": time.getHours(), //小时
        "m+": time.getMinutes(), //分
        "s+": time.getSeconds(), //秒
        "q+": Math.floor((time.getMonth() + 3) / 3), //季度
        "S": time.getMilliseconds() //毫秒
    };
    if (/(y+)/.test(format)) format = format.replace(RegExp.$1, (time.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(format)) format = format.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return format;
}
com.util.showWeek = function (w_date) {
    switch (w_date) {
        case 0:
            w_date = "周日"
            break;
        case 1:
            w_date = "周一"
            break;
        case 2:
            w_date = "周二"
            break;
        case 3:
            w_date = "周三"
            break;
        case 4:
            w_date = "周四"
            break;
        case 5:
            w_date = "周五"
            break;
        case 6:
            w_date = "周六"
            break;
        default:
            break;
    }
    return w_date;
}
com.util.diffMinute = function (start_date, end_date) {
    var start_ = Date.parse(start_date.replace(/-/g, "/"));
    var end_ = Date.parse(end_date.replace(/-/g, "/"));
    var s = (start_ - end_) / 1000;
    if (s % 60 == 0) {
        return parseInt(s / 60);
    } else {
        return parseInt(s / 60) + 1;
    }
}
com.util.diffDay = function (start_date, end_date) {
    var start_ = Date.parse(start_date.replace(/-/g, "/"));
    var end_ = Date.parse(end_date.replace(/-/g, "/"));
    var date3 = start_ - end_;  //时间差的毫秒数
    return Math.floor(date3 / (24 * 3600 * 1000));
}
com.util.addDay = function (start_date, day) {
    var start_ = Date.parse(start_date.replace(/-/g, "/"));
    return com.util.formatDate(start_ + day * 24 * 60 * 60 * 1000, "yyyy-MM-dd", 1);
}
/*
 * url 目标url
 * arg 需要替换的参数名称
 * arg_val 替换后的参数的值
 * return url 参数替换后的url
 */
com.util.changeURLArg = function (url, arg, arg_val) {
    var pattern = arg + '=([^&]*)';
    var replaceText = arg + '=' + arg_val;
    if (url.match(pattern)) {
        var tmp = '/(' + arg + '=)([^&]*)/gi';
        tmp = url.replace(eval(tmp), replaceText);
        return tmp;
    } else {
        if (url.match('[\?]')) {
            return url + '&' + replaceText;
        } else {
            return url + '?' + replaceText;
        }
    }
    return url + '\n' + arg + '\n' + arg_val;
}
/**
 * 如果不存在就显示空
 * @param data
 */
com.util.es = function (data, def) {
    var def_ = "";
    if (def) {
        def_ = def;
    }
    return data ? data : def_;
}

/**
 * 校验是否为double
 */
com.util.checkDouble = function (checkString) {
    var reg = /^[-\+]?\d+(\.\d+)?$/;
    if (reg.test(checkString)) {
        return true;
    }
    return false;
}

//==================================================#深度克隆
com.util.clone = function (obj) {
    var objClone;
    if (obj.constructor == Object) {
        objClone = new obj.constructor();
    } else {
        objClone = new obj.constructor(obj.valueOf());
    }
    for (var key in obj) {
        if (objClone[key] != obj[key]) {
            if (typeof(obj[key]) == 'object') {
                objClone[key] = com.util.clone(obj[key]);
            } else {
                objClone[key] = obj[key];
            }
        }
    }
    objClone.toString = obj.toString;
    objClone.valueOf = obj.valueOf;
    return objClone;
}

//---------------------------------------------获取hmtl get 方式的页面间参数解析
if (!com.html_get) {
    com.html_get = new Object();
}

com.html_get.getValue = function (key) {
    var strHref = window.document.location.href;
    var intPos = strHref.indexOf("?");
    var strRight = strHref.substr(intPos + 1);

    var del_Pos = strRight.indexOf("#");
    if (del_Pos > 0) {
        strRight = strRight.substring(0, del_Pos);
    }
    var arrTmp = strRight.split("&");
    for (var i = 0; i < arrTmp.length; i++) {
        var arrTemp = arrTmp[i].split("=");
        if (arrTemp[0].toUpperCase() == key.toUpperCase()) return arrTemp[1];
    }
    return "";
}

//设置
com.html_get.setParam = function (key, value) {
    var url = window.document.location.href;
    var str = "";
    if (url.indexOf('?') != -1)
        str = url.substr(url.indexOf('?') + 1);
    else
        return url + "?" + key + "=" + value;
    var returnurl = "";
    var setparam = "";
    var arr;
    var modify = "0";
    if (str.indexOf('&') != -1) {
        arr = str.split('&');
        for (i in arr) {
            if (arr[i].split('=')[0] == key) {
                setparam = value;
                modify = "1";
            }
            else {
                setparam = arr[i].split('=')[1];
            }
            returnurl = returnurl + arr[i].split('=')[0] + "=" + setparam + "&";
        }
        returnurl = returnurl.substr(0, returnurl.length - 1);
        if (modify == "0")
            if (returnurl == str)
                returnurl = returnurl + "&" + key + "=" + value;
    }
    else {
        if (str.indexOf('=') != -1) {
            arr = str.split('=');
            if (arr[0] == key) {
                setparam = value;
                modify = "1";
            }
            else {
                setparam = arr[1];
            }
            returnurl = arr[0] + "=" + setparam;
            if (modify == "0")
                if (returnurl == str)
                    returnurl = returnurl + "&" + key + "=" + value;
        }
        else
            returnurl = key + "=" + value;
    }
    return url.substr(0, url.indexOf('?')) + "?" + returnurl;
}

//移除参数
com.html_get.removeParam = function (ref) {
    var url = window.document.location.href;
    var str = "";
    if (url.indexOf('?') != -1) {
        str = url.substr(url.indexOf('?') + 1);
    }
    else {
        return url;
    }
    var arr = "";
    var returnurl = "";
    var setparam = "";
    if (str.indexOf('&') != -1) {
        arr = str.split('&');
        for (i in arr) {
            if (arr[i].split('=')[0] != ref) {
                returnurl = returnurl + arr[i].split('=')[0] + "=" + arr[i].split('=')[1] + "&";
            }
        }
        return url.substr(0, url.indexOf('?')) + "?" + returnurl.substr(0, returnurl.length - 1);
    }
    else {
        arr = str.split('=');
        if (arr[0] == ref) {
            return url.substr(0, url.indexOf('?'));
        }
        else {
            return url;
        }
    }
}

//---------------------------------------------模版引擎封装

if (!com.doT) {
    com.doT = new Object();
}

com.doT.get = function (template_id, data) {
    return doT.template(document.querySelector("#" + template_id).innerHTML)(data);
}
//---------------------------------------------表单的公用方法
if (!com.form) {
    com.form = new Object();
}
//---------------------------------------------验证信息
if (!com.valid) {
    com.valid = new Object();
}

/*
 根据〖中华人民共和国国家标准 GB 11643-1999〗中有关公民身份号码的规定，公民身份号码是特征组合码，由十七位数字本体码和一位数字校验码组成。排列顺序从左至右依次为：六位数字地址码，八位数字出生日期码，三位数字顺序码和一位数字校验码。
 地址码表示编码对象常住户口所在县(市、旗、区)的行政区划代码。
 出生日期码表示编码对象出生的年、月、日，其中年份用四位数字表示，年、月、日之间不用分隔符。
 顺序码表示同一地址码所标识的区域范围内，对同年、月、日出生的人员编定的顺序号。顺序码的奇数分给男性，偶数分给女性。
 校验码是根据前面十七位数字码，按照ISO 7064:1983.MOD 11-2校验码计算出来的检验码。

 出生日期计算方法。
 15位的身份证编码首先把出生年扩展为4位，简单的就是增加一个19或18,这样就包含了所有1800-1999年出生的人;
 2000年后出生的肯定都是18位的了没有这个烦恼，至于1800年前出生的,那啥那时应该还没身份证号这个东东，⊙﹏⊙b汗...
 下面是正则表达式:
 出生日期1800-2099  (18|19|20)?\d{2}(0[1-9]|1[12])(0[1-9]|[12]\d|3[01])
 身份证正则表达式 /^\d{6}(18|19|20)?\d{2}(0[1-9]|1[12])(0[1-9]|[12]\d|3[01])\d{3}(\d|X)$/i
 15位校验规则 6位地址编码+6位出生日期+3位顺序号
 18位校验规则 6位地址编码+8位出生日期+3位顺序号+1位校验位

 校验位规则     公式:∑(ai×Wi)(mod 11)……………………………………(1)
 公式(1)中：
 i----表示号码字符从由至左包括校验码在内的位置序号；
 ai----表示第i位置上的号码字符值；
 Wi----示第i位置上的加权因子，其数值依据公式Wi=2^(n-1）(mod 11)计算得出。
 i 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
 Wi 7 9 10 5 8 4 2 1 6 3 7 9 10 5 8 4 2 1
 */
//身份证号合法性验证
//支持15位和18位身份证号
//支持地址编码、出生日期、校验位验证
com.valid.identityCode = function (code) {
    var city = {
        11: "北京",
        12: "天津",
        13: "河北",
        14: "山西",
        15: "内蒙古",
        21: "辽宁",
        22: "吉林",
        23: "黑龙江 ",
        31: "上海",
        32: "江苏",
        33: "浙江",
        34: "安徽",
        35: "福建",
        36: "江西",
        37: "山东",
        41: "河南",
        42: "湖北 ",
        43: "湖南",
        44: "广东",
        45: "广西",
        46: "海南",
        50: "重庆",
        51: "四川",
        52: "贵州",
        53: "云南",
        54: "西藏 ",
        61: "陕西",
        62: "甘肃",
        63: "青海",
        64: "宁夏",
        65: "新疆",
        71: "台湾",
        81: "香港",
        82: "澳门",
        91: "国外 "
    };
    var tip = "";
    var pass = true;

    if (!code || !/^\d{6}(18|19|20)?\d{2}(0[1-9]|1[12])(0[1-9]|[12]\d|3[01])\d{3}(\d|X|x)$/i.test(code)) {
        tip = "身份证号格式错误";
        pass = false;
    }

    else if (!city[code.substr(0, 2)]) {
        tip = "地址编码错误";
        pass = false;
    }
    else {
        //18位身份证需要验证最后一位校验位
        if (code.length == 18) {
            code = code.split('');
            //∑(ai×Wi)(mod 11)
            //加权因子
            var factor = [7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2];
            //校验位
            var parity = [1, 0, 'X', 9, 8, 7, 6, 5, 4, 3, 2];
            var sum = 0;
            var ai = 0;
            var wi = 0;
            for (var i = 0; i < 17; i++) {
                ai = code[i];
                wi = factor[i];
                sum += ai * wi;
            }
            var last = parity[sum % 11];
            var parity_ = parity[sum % 11];
            var parity_1 = null;
            if (parity_ == 'X') {
                parity_1 = 'x';
            } else {
                parity_1 = parity_;
            }
            if (parity_ != code[17] && parity_1 != code[17]) {
                tip = "校验位错误";
                pass = false;
            }
        }
    }
    //if(!pass) alert(tip);
    return pass;
}

/**
 * 验证手机号
 * @param phone
 * @returns {boolean}
 */
com.valid.phone = function (phone) {
    if (!(/^1[3|4|5|7|8]\d{9}$/.test(phone))) {
        return false;
    }
    return true;
}

com.valid.score = function (fen) {
    var reg = /^\d{1,3}$/;
    var re = fen.match(reg);
    if (re) {
        if (fen < 100)
            return true;
    }
    return false;
}

/**
 * 验证邮箱
 验证规则：姑且把邮箱地址分成“第一部分@第二部分”这样
 第一部分：由字母、数字、下划线、短线“-”、点号“.”组成，
 第二部分：为一个域名，域名由字母、数字、短线“-”、域名后缀组成，
 而域名后缀一般为.xxx或.xxx.xx，一区的域名后缀一般为2-4位，如cn,com,net，现在域名有的也会大于4位
 * @param email_
 * @returns {boolean}
 */
com.valid.email = function (email_) {
    //对电子邮件的验证
    var myreg = /^(\w-*\.*)+@(\w-?)+(\.\w{2,})+$/;
    return myreg.test(email_);
}

//---------------------------------------------自定义的,重写和添加的方法，原生的
String.prototype.replaceAll = function (s1, s2) {
    return this.replace(new RegExp(s1, "gm"), s2);
}
//---------------------------------------------显示一些信息
if (!com.show) {
    com.show = new Object();
}

/*
 根据文件的 大小，显示计算出合理的数值，999.123G,800mb,1.3mb，900kb，
 */
com.show.fileSize = function (size) {
    if (size <= 999) {
        return size + "B";
    }

    var kb = parseFloat(size / 1024);
    kb = kb.toFixed(2);
    if (kb <= 999) {
        return kb + "KB";
    }

    var mb = parseFloat(parseInt(kb) / 1024);
    mb = mb.toFixed(2);
    if (mb <= 999) {
        return mb + "MB";
    }

    var gb = parseFloat(parseInt(mb) / 1024);
    gb = gb.toFixed(2);
    if (gb <= 999) {
        return gb + "GB";
    }

    var tb = parseFloat(parseInt(gb) / 1024);
    tb = tb.toFixed(2);
    return tb + "TB";
}

com.show.nodata = function (tip) {
    return "<div style=\"position: fixed;top:30%;width: 100%\">" +
        "<div style=\"width: 90%;margin-left: 5%;text-align: center\">" +
        "<p style='font-size: 16px;'>" + tip + "</p>" +
        "<img src=\"img/icon/def_no_data.png\" style=\"width: 50%;margin-top: 10px;\" />" +
        "</div>" +
        "</div>";
}

//---------------------------------------------h5 的一些方法
if (!com.h5) {
    com.h5 = new Object();
}
com.h5.storage_get = function (key) {
    var info = localStorage[key];
    if (info) {
        return JSON.parse(info);
    }
    return null;
}
com.h5.storage_put = function (key, json_obj) {
    localStorage[key] = JSON.stringify(json_obj);
}

com.h5.storage_remove = function (key) {
    localStorage[key] = undefined;
}

com.h5.storage_clear = function () {
    localStorage.clear();//清除所有存储的数据。
}

//---------------------------------------------param 的一些方法
if (!com.param) {
    com.param = new Object();
}
//第一次加载时间
com.param.firstTime = 500;

// 1000-外伶仃岛, 2000-桂山岛 ,3000-东澳岛 ,4000-大万山岛


//---------------------------------------------medis 的一些方法

if (!com.media) {
    com.media = new Object();
}

com.media.MyMedia = function () {
    return {
        media: null
        , event_progress: null
        , event_end: null
        , event_stop:null
        , _interval: null
        , init: function (init_opt) {
            if (!init_opt || !init_opt.media) {//如果不存在
                console.error("缺少参数 media 节点对象")
                return;
            }
            console.log("medis_html:"+init_opt.media.outerHTML);

            this.media = init_opt.media ? init_opt.media : null;
            this.event_progress = init_opt.event_progress ? init_opt.event_progress : null;
            this.event_end = init_opt.event_end ? init_opt.event_end : null;
            this.event_stop = init_opt.event_stop ? init_opt.event_stop : null;

            var that_ = this;
            this.media.addEventListener("ended", function () {
                console.log("ended");
                clearInterval(that_._interval);
                if (that_.event_end) {
                    that_.event_end();
                }
            }, false);
            this.media.addEventListener("playing", function () {
                console.log("playing");
                if (that_._interval) {
                    clearInterval(that_._interval);
                }
                that_._interval = setInterval(function () {
                    that_.updateProgress();
                }, 1000);
            }, false);
            this.media.addEventListener("pause", function () {
                console.log("pause");
                clearInterval(that_._interval);
                if (that_.event_stop) {
                    that_.event_stop();
                }
            }, false);
        }
        , updateProgress: function () {
            var all_time = this.media.duration;
            var curr_time = this.media.currentTime;
            console.log("all_time:"+all_time+"-curr_tiime:"+curr_time);
            var a = (curr_time / all_time);
            var bfb = parseInt((a.toFixed(2) * 100));
            if (this.event_progress) {
                this.event_progress(bfb);
            }
        }
        , setSrc: function (url) {
            this.media.src = url;
        }
        , play: function (url) {
            if (url && this.media.src != url) {
                console.log('set_url:' + url);
                this.setSrc(url);
            }
            this.media.play();
        }
        , reload: function () {
            this.media.load();
            this.media.play();
        }
        , stop: function () {
            this.media.pause();
        }
    }

}

//---------------------------------------------新建窗口 的一些方法
if (!com.webview) {
    com.webview = new Object();
}

com.webview.MyWebview = function () {
    return {
        _webview: null
        , _iframe: null
        , _close: null
        , event_close: null
        , init: function () {
            var that_ = this;
            that_._webview = document.getElementById("com_webview");
            if (that_._webview) {
                //删除元素节点
                var _parentElement = _com_webview.parentNode;
                if (_parentElement) {
                    _parentElement.removeChild(_com_webview);
                }
            }

            //创建webvew
            that_._webview = document.createElement("div");
            that_._webview.setAttribute("id", "com_webview");
            that_._webview.style.display = 'none';

            that_._iframe = document.createElement("iframe");
            that_._close = document.createElement("span");
            that_._close.classList.add('close');

            that_._close.onclick = function () {
                that_._webview.style.display = 'none';
            }

            that_._webview.appendChild(that_._iframe);
            that_._webview.appendChild(that_._close);

            document.body.appendChild(that_._webview);
        }
        , openUrl: function (url) {
            console.log(url);
            var that_ = this;
            this._iframe.setAttribute("src", url);
            that_._webview.style.display = 'block';
        }
    }
}

// -----------------------------------------------lazyimg
if (!com.lazyimg) {
    com.lazyimg = new Object();
}

/**
 <img class="img-lazyload" 懒加载图片的样式
 lazy_img="请求图片的路径" />
 */
com.lazyimg.load = function(_ele) {
    if (_ele) {
        com.lazyimg.loadOne(_ele);
        return;
    }
    var lazyimgs = document.querySelectorAll("img[lazy_img]");
    for (var i = 0; i < lazyimgs.length; i++) {
        com.lazyimg.loadOne(lazyimgs[i]);
    }
}

com.lazyimg.loadOne=function(_ele){
    var debug=true;

    var img_url = _ele.getAttribute("lazy_img");
    if(!img_url){
        return;
    }

    // new temp_img 用于判断图片文件是否存在
    var temp_img = new Image();
    temp_img.src = img_url;
    temp_img.onload = function(){
        _ele.setAttribute('src', img_url);
        _ele.classList.add('img-lazyload');
        return;
    }
    temp_img.onerror = function(e){
    }
}

// ----------------------------------------------- 定位
if(!com.location){
    com.location=new Object();
}

/**
 * 获取本地的位置
 * @param fun_success（｛ longitude,latitude ｝）
 * @param fun_error( 错误信息 )
 */
com.location.get=function(fun_success,fun_error){
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(
            function (position) {
                fun_success({"latitude":position.coords.latitude, "longitude": position.coords.longitude});
            }
            , function showError(error) {
                switch (error.code) {
                    case error.PERMISSION_DENIED:
                        fun_error("用户拒绝对获取地理位置的请求。");
                        break;
                    case error.POSITION_UNAVAILABLE:
                        fun_error("位置信息是不可用的。");
                        break;
                    case error.TIMEOUT:
                        fun_error("请求用户地理位置超时。");
                        break;
                    case error.UNKNOWN_ERROR:
                        fun_error("未知错误。");
                        break;
                }
            }
        );
    } else {
        fun_error("该浏览器不支持定位功能");
    }

}

com.location.getBaidu=function(fun_success,fun_error){
    var that_=this;
    that_.get(function(position){

        var gpsPoint = new BMap.Point(position.longitude, position.latitude);
        var gpsArr = [];
        gpsArr.push(gpsPoint);
        var convertor = new BMap.Convertor();////坐标转换,gps  转换为百度坐标
        convertor.translate(gpsArr, 1, 5, function (data) {//坐标转换,gps  转换为百度坐标
            if (data.status === 0) {
                if (data.points.length == 0) {
                    return;
                }

                var po = data.points[0];
                fun_success({
                    lng:po.lng
                    ,lat:po.lat
                });
            } else {
                fun_error("坐标转换失败");
            }
        });
    },fun_error);

}