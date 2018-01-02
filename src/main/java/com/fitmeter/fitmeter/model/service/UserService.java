package com.fitmeter.fitmeter.model.service;

import com.fitmeter.fitmeter.model.User;
import com.fitmeter.fitmeter.model.security.UserRole;

import java.util.Set;


public interface UserService {
    User findByUsername(String username);

    User findByEmail(String email);

    boolean checkUserExists(String username, String email);

    boolean checkUsernameExists(String username);

    boolean checkEmailExists(String email);

    void saveUser(User user);

    User createUser(User user, Set<UserRole> userRoles);

}
