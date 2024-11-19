package com.security.service;

import com.security.entity.User;
import org.springframework.stereotype.Service;


public interface UserService {

    public User saveUser(User user);

    public void removeSessionMessage();
}
