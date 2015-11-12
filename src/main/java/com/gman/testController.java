package com.gman;


import com.gman.repository.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired private UserRepository userRepository;

    @RequestMapping("/test")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return "HELLO";
    }

    @RequestMapping("/getDB")
    public @ResponseBody List<User> getUserList() {

        return userRepository.findAll();
    }

}
