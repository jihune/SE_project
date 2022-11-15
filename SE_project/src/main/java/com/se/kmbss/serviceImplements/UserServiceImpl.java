package com.se.kmbss.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.kmbss.mapper.UserMapper;
import com.se.kmbss.model.UserDTO;
import com.se.kmbss.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper user_mapper;

    @Override
    public Integer join(UserDTO user){
        return user_mapper.join(user);
    }

    @Override
    public boolean isUniqueId(UserDTO user) {
        if(user_mapper.checkId(user).size() == 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isOverlapNick(UserDTO user) {
        if(user_mapper.checkNick(user).size() == 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public UserDTO login(UserDTO user){
        return user_mapper.login(user);
    }

    @Override
    public boolean isOverlapEmail(UserDTO user) {
        if(user_mapper.checkEmail(user).size() == 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String findMyId(UserDTO user) {
        UserDTO result = user_mapper.findMyId(user);
        System.out.println(result);
        return result.getId();
    }

    @Override
    public Integer changeMyInfo(UserDTO user) {
        return user_mapper.changeMyInfo(user);
    }
}
