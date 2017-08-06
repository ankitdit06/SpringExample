/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.onetomanyspringdatajpa.config;

import com.example.onetomanyspringdatajpa.entity.Area;
import com.example.onetomanyspringdatajpa.entity.City;
import com.example.onetomanyspringdatajpa.service.CityService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Ankit
 */
public class Main {
    
    public static void main(String args[]){
    ApplicationContext context = new AnnotationConfigApplicationContext("com.example.onetomanyspringdatajpa.config");
       CityService cityService= context.getBean(CityService.class);
       City city=new City();
       city.setCityName("Bangalore");
       List<Area> areas=new ArrayList<Area>();
       for(int i=0;i==5;i++){
           Area area=new Area();
           area.setPincode(560100+i);
           area.setCity(city);
           areas.add(area);
       }
       city.setAreas(areas);
       cityService.save(city);
       
   
    }
    
}
