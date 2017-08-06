/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.onetomanyspringdatajpa.repository;

import com.example.onetomanyspringdatajpa.entity.City;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ankit
 */
@Repository
public interface CityRepository extends JpaRepository<City, Serializable>{
    
    
}
