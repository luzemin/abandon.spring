package com.abandon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.abandon.common.R;
import com.abandon.model.domain.User;
import com.abandon.model.request.UserRequest;

public interface UserService extends IService<User> {

    R login(UserRequest userRequest);

    R create(UserRequest userRequest);

    R getAllUsers();
}
