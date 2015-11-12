package com.gman.service;

import com.gman.UserRepository;
import com.gman.repository.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gmanpark on 2015. 11. 12..
 */
@Service("UserService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List findAll() {
        return userRepository.findAll();
    }

    @Override
    public com.gman.repository.User create(String name, String phone, String address) {
        User user = new User(name, phone, address);

        userRepository.save(user);
        return null;
    }

    @Override
    public com.gman.repository.User update(com.gman.repository.User forum) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
