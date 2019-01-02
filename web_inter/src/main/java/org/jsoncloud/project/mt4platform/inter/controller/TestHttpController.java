package org.jsoncloud.project.mt4platform.inter.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

//import javax.servlet.http.HttpServletRequest;
//import java.rmi.RemoteException;
//import java.util.Map;

/**
 * Created by Administrator on 2019/1/2 0002.
 */
@RequestMapping("/jin10Info")
@RestController
public class TestHttpController {
    private static final String aimUrl = "";

    public static void main(String[] args) {
        try {
            Document doc1 = Jsoup.connect("https://www.jin10.com/example/jin10.com.html?messageNum=50").get();
            String title = doc1.title();
            System.out.println(doc1);
            System.out.println(title);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * first Test for jsonp
     * @param request
     * @return
     */
//    @ResponseBody
//    @RequestMapping("/firstTest")
//    public Map<String, Object> getLoginBalanceOut(HttpServletRequest request) throws RemoteException {
//
//        return null;
//    }
}
