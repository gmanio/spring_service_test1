package com.gman.component;

import com.gman.repository.User;
import com.gman.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {

    @Autowired
    UserServiceImpl userServiceImpl;

    @Scheduled(fixedRate=5000)
    public void insert() {
        User saveUser = new User();
        saveUser.setName("PPPP");
        saveUser.setPhone("RRRRRRR");
        saveUser.setAddress("AAAA");

        userServiceImpl.create(saveUser);
    }
}
