package com.netlovespring.controller;

import com.netlovespring.common.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // 注意这里是RestController, 而不是Controller
public class DefaultController {
    @GetMapping("/health")
    public R index() {
        return R.success("OK"); //RestController 返回的是 json 数据
    }
}
