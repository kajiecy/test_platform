<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta name="viewport" content="width=device-width" />
    <title>WebSocket 客户端</title>
</head>
<body>
<div>
    <input type="button" id="btnConnection" value="连接" />
    <input type="button" id="btnClose" value="关闭" />
    <input type="button" id="btnSend" value="发送" />
</div>
<div>
    <span>服务器返回随机数：</span><span id="show"></span>
</div>
<script src="js/jquery.min_1.8.3.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
    var socket;
    if(typeof(WebSocket) == "undefined"){
        alert("您的浏览器不支持WebSocket");
    }

    $("#btnConnection").click(function() {
        //实现化WebSocket对象，指定要连接的服务器地址与端口
        socket = new WebSocket("ws://192.168.3.172:8080/ws/abc/chenyang");
        //打开事件
        socket.onopen = function() {

        };
        //获得消息事件
        socket.onmessage = function(msg) {
//            alert(msg.data);
            $("#show").text(msg.data);
        };
        //关闭事件
        socket.onclose = function() {
            alert("Socket已关闭");
        };
        //发生了错误事件
        socket.onerror = function() {
            alert("发生了错误");
        }
    });

    //发送消息
    $("#btnSend").click(function() {
        socket.send("收到消息");
    });

    //关闭
    $("#btnClose").click(function() {
        socket.close();
    });
</script>
</body>

</html>
