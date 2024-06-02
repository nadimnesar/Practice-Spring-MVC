package com.nadimnesar.service;

import com.nadimnesar.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> userList = new ArrayList<User>();

    public List<User> getUserList(){
        return userList;
    }

    public void addUser(User user){
        userList.add(user);
    }
}