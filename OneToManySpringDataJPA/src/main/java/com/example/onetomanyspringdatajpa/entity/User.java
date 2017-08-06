package com.example.onetomanyspringdatajpa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Ankit
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String password;
    @OneToOne(mappedBy = "user",cascade=CascadeType.ALL)
    private UserDetails userDetail;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the userDetail
     */
    public UserDetails getUserDetail() {
        return userDetail;
    }

    /**
     * @param userDetail the userDetail to set
     */
    public void setUserDetail(UserDetails userDetail) {
        this.userDetail = userDetail;
    }
    
}
