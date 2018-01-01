package com.fitmeter.fitmeter.model.service.UserServiceImpl;

import com.fitmeter.fitmeter.model.User;
import com.fitmeter.fitmeter.model.dao.UserDaoRepository;
import com.fitmeter.fitmeter.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDaoRepository userDaoRepository;

    public void saveUser(User user){
        userDaoRepository.save(user);
    }

    public User findByUsername(String username){
        return userDaoRepository.findByUsername(username);
    }

    public User findByEmail(String email){
        return userDaoRepository.findByEmail(email);
    }

    public boolean checkUserExists(String username, String email){
        if(checkUsernameExists(username) || checkEmailExists(email)){
            return true;
        } else {
            return false;
        }
    }

    public boolean checkUsernameExists(String username){
        if(findByUsername(username) != null){
            return true;
        }
        return false;
    }

    public boolean checkEmailExists(String email){
        if(findByEmail(email) != null){
            return true;
        }
        return false;
    }


}
