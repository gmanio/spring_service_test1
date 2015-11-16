package com.gman;

import com.gman.repository.User;
import com.gman.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@Controller
public class JPAcrud {
    @Autowired
    UserServiceImpl userServiceImpl;


    @RequestMapping("/save")
    public void insert(){
        User saveUser = new User();
        saveUser.setName("PPPP");
        saveUser.setPhone("RRRRRRR");
        saveUser.setAddress("AAAA");

        userServiceImpl.create(saveUser);
    }

    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        userServiceImpl.delete(id);
    }

    @RequestMapping("/findall")
    public @ResponseBody List<User> selectAll(){
        return userServiceImpl.findAll();
    }

    @RequestMapping("/update")
    public


}
