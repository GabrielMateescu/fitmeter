package com.fitmeter.fitmeter.model.dao;

import com.fitmeter.fitmeter.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDaoRepository extends CrudRepository<User, Long>{
    User findByUsername(String username);
    User findByEmail(String email);
}