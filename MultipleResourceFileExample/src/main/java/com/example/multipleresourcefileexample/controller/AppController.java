/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.multipleresourcefileexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Ankit
 */
@Controller
@RequestMapping("/")
public class AppController {
    
       @Autowired
    private Environment env;
   
    
    @RequestMapping(value = {"/"},method = RequestMethod.GET)
    public String home(ModelMap model) {
        String appName=env.getProperty("app.name");
        String msg=env.getProperty("msg1");
        model.addAttribute("appName", appName);
        model.addAttribute("msg", msg);
        
        return "index";
    }
}
