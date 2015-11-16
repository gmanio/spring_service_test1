package com.gman.service;

import com.gman.repository.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User create(User user);
    public void update(User user);
    public void delete(Long id);
}
