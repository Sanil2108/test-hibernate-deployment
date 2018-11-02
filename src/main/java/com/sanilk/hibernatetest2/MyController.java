package com.sanilk.hibernatetest2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @Autowired
    ContactRepository contactRepository;

    @RequestMapping("/")
    public String getIndex(){
        contactRepository.save(new Contact(1, "sanil", "sanilkhurana7@gmail.com"));

        return "index.html";
    }

}
