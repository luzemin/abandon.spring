package com.netlovespring;

import com.netlovespring.common.R;
import com.netlovespring.service.UserService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserService userService;

    @Test
    @Disabled
    public void testGetAllUsers() {
        R result = userService.getAllUsers();
        assertNotNull(result);
        assertEquals("success", result.getMessage());
    }
}
