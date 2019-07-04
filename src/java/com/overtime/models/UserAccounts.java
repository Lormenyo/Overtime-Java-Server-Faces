/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.overtime.models;

import java.util.Date;

/**
 *
 * @author Hannah
 */
public class UserAccounts {
    
    
    private String record_id;
    private String username;
    private String userRole;
    private Date createdDate;
    private String createdBy;
    private Date modifiedDate;
    private String modifiedBy;
    private Date verifiedDate;
    private String verifiedBy;
    private String affiliate;
    private String status;
    
    public String getRecord_id() {
        return record_id;
    }

    public void setRecord_id(String record_id) {
        this.record_id = record_id;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
    
      public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date date) {
        this.createdDate = date;
    }
    
    
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    
    public Date getVerifiedDate() {
        return verifiedDate;
    }

    public void setVerifiedDate(Date date) {
        this.verifiedDate = date;
    }
    
    public String getVerifiedBy() {
        return verifiedBy;
    }

    public void setVerifiedBy(String verifiedBy) {
        this.verifiedBy = verifiedBy;
    }
    
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
    
    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public void setAffiliate(String affiliate) {
        this.affiliate = affiliate;
    }
    
    public String getAffiliate() {
        return affiliate;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public String getStatus() {
        return status;
    }   
    
}

