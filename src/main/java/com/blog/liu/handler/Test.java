package com.blog.liu.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {

    @ResponseBody
    @RequestMapping("/")
    public String Test(){

        return "uuuuu";
    }
}
