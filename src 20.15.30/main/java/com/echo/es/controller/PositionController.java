package com.echo.es.controller;

import com.echo.es.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class PositionController {
    @Autowired
    private PositionService service;

    // 测试页面
    @GetMapping({"/","/index"})
    public   String  indexPage(){
        return  "index";
    }

    @RequestMapping("/importAll")
    @ResponseBody
    public   String  importAll(){
        try {
            service.importAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  "success";
    }
}
