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
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(Long id) {
        userRepository.delete(id);
    }
}
