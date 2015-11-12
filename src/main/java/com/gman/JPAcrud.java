package com.gman;

import com.gman.repository.User;
import com.gman.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Controller
public class JPAcrud {
    @Autowired
    UserServiceImpl userServiceImpl;


    @RequestMapping("/save/{name}/{phone}/{address}")
    public String insert(@PathVariable("name") String name, @PathVariable("phone") String phone, @PathVariable("address") String address){

        userServiceImpl.create(name, phone, address);
        return "성공";
    }

    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id){

    }


}
