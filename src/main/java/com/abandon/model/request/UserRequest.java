package com.abandon.model.request;

import lombok.Data;

@Data
public class UserRequest {
    private Integer id;

    private String username;

    private String password;
}
