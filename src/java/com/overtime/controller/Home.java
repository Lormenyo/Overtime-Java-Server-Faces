/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.overtime.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Hannah
 */
@ManagedBean(name="home", eager=true)
@RequestScoped
public class Home {
    
    private String username;
    private String password;
    
    /**
     * Creates a new instance of Home
     */
    public Home() {
        System.out.println("This is the Home page");
    }
   
    /**
     *
     * @return
     */
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    
}
