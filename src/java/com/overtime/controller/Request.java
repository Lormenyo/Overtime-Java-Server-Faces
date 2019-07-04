/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.overtime.controller;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Hannah
 */
@ManagedBean
@RequestScoped
public class Request {
    
    private Date startDate;
    private Date endDate;
    private String requester;
    private String email;
    private String justification;

    /**
     * Creates a new instance of Request
     */
    public Request() {
    }
    
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date date) {
        this.startDate = date;
    }
    
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date date) {
        this.endDate = date;
    }
    
    public String getRequester() {
        return requester;
    }

    public void setRequester(String name) {
        this.requester = name;
    }
    
    public String getJustification() {
        return justification;
    }

    public void setJustification(String justification) {
        this.justification = justification;
    }
}
