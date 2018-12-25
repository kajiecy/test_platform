package org.jsoncloud.project.mt4platform.inter.controller;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

//ws://127.0.0.1:8087/Demo1/ws/张三
@ServerEndpoint("/ws/{user}/{name}")
public class TestController extends BaseController{
    private String currentUser;
    //连接打开时执行
    @OnOpen
    public void onOpen(@PathParam("user") String user,@PathParam("name") String name, Session session) throws InterruptedException {
        for(int i = 0;i<100;i++){
//            生成随机数
            double radom = Math.random();
            System.out.println("生成随机数发送给客户端："+radom);
            session.getAsyncRemote().sendText(radom+"");
            Thread.sleep(200);
        }
    }

    //收到消息时执行
    @OnMessage
    public String onMessage(String message, Session session) {
//        System.out.println(currentUser + "：" + message);
        double aa = Math.random();
//        System.out.println("收到消息生成随机数"+aa);
        return aa+"";
    }

    //连接关闭时执行
    @OnClose
    public void onClose(Session session, CloseReason closeReason) {
        System.out.println(String.format("Session %s closed because of %s", session.getId(), closeReason));
    }

    //连接错误时执行
    @OnError
    public void onError(Throwable t) {
        t.printStackTrace();
    }
}
