/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.onetomanyspringdatajpa.service;

import com.example.onetomanyspringdatajpa.entity.City;
import com.example.onetomanyspringdatajpa.repository.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ankit
 */
@Service
public class CityService implements ICityService{

    @Autowired
    private CityRepository cityRepository;
    @Override
    public City save(City city) {
        return cityRepository.save(city);
        
    }
    
}
