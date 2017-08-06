/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.onetoonespringdatajpa.config;

import com.example.onetoonespringdatajpa.entity.User;
import com.example.onetoonespringdatajpa.entity.UserDetails;
import com.example.onetoonespringdatajpa.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Ankit
 */
public class Main {
    
    public static void main(String args[]){
    ApplicationContext context = new AnnotationConfigApplicationContext("com.example.onetoonespringdatajpa.config");
       UserService userService= context.getBean(UserService.class);
       User user=new User();
       user.setPassword("abc");
       UserDetails ud=new UserDetails();
       ud.setfName("Martin");
       ud.setlName("Crow");
       ud.setEmailId("abc@xyz.com");
       user.setUserDetail(ud);
       ud.setUser(user);
       
       userService.save(user);
       
   
    }
    
}
