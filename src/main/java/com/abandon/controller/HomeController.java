package com.abandon.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // 注意这里是Controller，而不是RestController
public class HomeController {
    private final Logger logger = Logger.getLogger(getClass());

    @GetMapping("/home/index")
    public String index() {
        logger.info("Request for /home/index");
        return "index"; //返回的是页面名称，在Resources/templates目录下的index.html
    }
}
