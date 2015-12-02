package com.gman.controller;

import com.gman.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;

/**
 * Created by gmanpark on 2015-11-18.
 */
@Controller
public class ServiceController {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    UserService userRepository;

    @RequestMapping(value="/index", method = RequestMethod.GET)
    public String index(Model model) {

        return "index";
    }

    @RequestMapping(value="/date", method = RequestMethod.GET)
    public SimpleDateFormat date(Model model) {
        String format = "mm/dd/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(format);

        logger.info(String.valueOf(sdf));
        return sdf;
    }
}
