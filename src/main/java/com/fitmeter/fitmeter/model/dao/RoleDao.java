package com.fitmeter.fitmeter.model.dao;

import com.fitmeter.fitmeter.model.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
