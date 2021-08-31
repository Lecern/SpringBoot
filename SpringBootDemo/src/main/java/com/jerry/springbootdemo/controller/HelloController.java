package com.jerry.springbootdemo.controller;

import com.jerry.springbootdemo.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public Person person;

    @Autowired
    public void setPerson(Person person) {
        this.person = person;
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello SpringBoot!";
    }

    @RequestMapping("/hello2")
    public String hello2() {
        return person.toString();
    }

}
