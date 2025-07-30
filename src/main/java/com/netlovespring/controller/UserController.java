package com.netlovespring.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.log4j.Logger;
import com.netlovespring.common.R;
import com.netlovespring.model.request.UserRequest;
import com.netlovespring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "User API", description = "all api about users")
@RestController
public class UserController {
    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private UserService userService;

    @PostMapping("/api/user/login")
    @Operation(summary = "User login", description = "just pass the username and password")
    public R userLogin(@RequestBody UserRequest userRequest) {
        logger.info("user login with " + userRequest.getUsername());
        return userService.login(userRequest);
    }

    @GetMapping("/api/user/all")
    public R getAllUsers() {
        return userService.getAllUsers();
    }
}
