package com.gman.component;

import com.gman.repository.User;
import com.gman.service.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    UserServiceImpl userServiceImpl;

//    @Scheduled(fixedRate=5000)
    public void insert() {
        User saveUser = new User();
        saveUser.setName("PPPP");
        saveUser.setPhone("RRRRRRR");
        saveUser.setAddress("AAAA");

        userServiceImpl.create(saveUser);
    }

    @Value("${gman.name}")
    String name;

    @Scheduled(fixedRate=5000)
    public void printProperty(){
        logger.debug(name);
    }
}
