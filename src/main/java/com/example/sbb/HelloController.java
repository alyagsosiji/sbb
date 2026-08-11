package com.example.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    String hello() {
        return "Hello World";
    }

    @GetMapping("/hi")
//    @ResponseBody   // 주석처리 --> "hello.html"
    public String abc() {
        return "hello";
    }

}
