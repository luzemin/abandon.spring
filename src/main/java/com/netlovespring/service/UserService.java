package com.netlovespring.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.netlovespring.common.R;
import com.netlovespring.model.domain.User;
import com.netlovespring.model.request.UserRequest;

public interface UserService extends IService<User> {

    R login(UserRequest userRequest);

    R create(UserRequest userRequest);

    R getAllUsers();
}
