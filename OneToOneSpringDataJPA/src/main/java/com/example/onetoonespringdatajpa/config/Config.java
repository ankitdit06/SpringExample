/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.onetoonespringdatajpa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 *
 * @author Ankit
 */
@Configuration
@ComponentScan(basePackages={"com.example.onetoonespringdatajpa"},excludeFilters=@ComponentScan.Filter(type=FilterType.REGEX,pattern={"com.example.onetoonespringdatajpa.config.*"}))
@PropertySource({"classpath:application.properties"})
@EnableScheduling
@EnableAspectJAutoProxy
@EnableCaching
public class Config {
    @Autowired
    private Environment env;
    
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
    @Bean
    public CacheManager cacheManager(){
        return new ConcurrentMapCacheManager();
    }
    
}
