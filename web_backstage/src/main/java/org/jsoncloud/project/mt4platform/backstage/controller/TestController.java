package org.jsoncloud.project.mt4platform.backstage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
    @ResponseBody
    @RequestMapping("/test.json")
    public String testContect(){
        String aaa= "Backstage-Successs";
        return aaa;
    }
}
