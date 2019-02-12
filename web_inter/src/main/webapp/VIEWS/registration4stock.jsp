<%--
  Created by IntelliJ IDEA.
  User: chenyang
  Date: 1019/2/12
  Time: 02:20
  To change this template use File | Settings | File Templates.
--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://" +request.getServerName()+":" +request.getServerPort()+path+"/" ;
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="../js/jquery.min_1.8.3.js"></script>
<%
    response.setCharacterEncoding("utf-8");
%>
<style>
    .title {
        width: 100%;
        height: 10vh;
        background-color: black;
        color: yellow;
        font-size: 25px;
        text-align: center;
        line-height: 10vh;
    }

    .content {
        width: 100%;
        font-size: 40px;
    }

    td {
        font-size: 40px;
        padding: 20px;
    }

    .tips {
        margin: 20px;
        font-size: 15px;
        font-style: normal;
    }

    p {
        margin: 20px;
        font-size: 15px;
    }

</style>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<div>
    <div class="title">
        欢迎来到 美股app 客户端，你将找到你的登录凭证。
    </div>
    <div class="content">
        <table>
            <tr>
                <td>登录名:</td>
                <td id="login_text"></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td id="password_text"></td>
            </tr>
            <%--<tr>--%>
                <%--<td>服务器类型:</td>--%>
                <%--<td id="server_text"></td>--%>
            <%--</tr>--%>
        </table>
        <div class="tips">
            请安全地保管好这些信息！
        </div>
        <p>
            现在您可以进行交易，分析报价和运行自动帮您交易的自动交易。注册 MQL5.com 访问
            交易信号，市场，自由职业者和虚拟主机服务。通过这些服务，你可以自动复制成功交易者的交易，
            从开发者们处购买或顶否交易 apps 和在虚拟平台副本每周全天候24小时的启动。
        </p>
        <br>
        <p>
            下载 IOS 和 Android 的移动应用程序，随时在全球任何地方持续交易，
        </p>
        <br>
        <p>
            MetaQuotes Software Core.
            <a href="http://www.metaquotes.net">http://www.metaquotes.net</a>
            <a href="mailto:support@metaquotes.net">support@metaquotes.net</a>
        </p>
    </div>
    <div>

    </div>
</div>
</body>
</html>
<script>
    $(function () {
        var data = {
            "login_token": "${param.login_token}"
        }
        if (!data.login_token) {
            alert("缺少login_token")
        }
        else {
            $.ajax({
                type: "post",
                url: "../mvc/user/info.json",
                data: JSON.stringify(data),
                dataType: "json",
                success: function (data){
                    console.log(data)
                    if (data.code == 2000) {
                        alert(data.message);
                        return;
                    }
                    else if (data.code == 0) {
                        $("#login_text").text(data.data.info.loginId)
                        $("#password_text").text(data.data.info.password)
                        $("#server_text").text(data.data.info.serverType)
                    }
                }
            });
        }
    })
</script>

