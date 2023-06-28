package com.test.mytestproject.controller;

import com.test.mytestproject.entity.TestReq;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PostMapping("/test")
    public String test(@RequestBody TestReq req){
//        return "successful"+ req.getName();
        return String.format(" successful=> %s 恭喜",req.getName());
    }
}
