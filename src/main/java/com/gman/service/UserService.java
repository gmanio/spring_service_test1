package com.gman.service;

import com.gman.repository.User;

import java.util.List;

public interface UserService {
    public List findAll();
    public User create(String name, String phone, String address);
    public User update(User user);
    public void delete(int id);
}
