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
public class Projects {
    
    private String record_id;
    private String project_name;
    private Date startDate;
    private Date endDate;
    private String description;
    private String department;
    private String affiliate;
    private String status;
    
    public String getRecord_id() {
        return record_id;
    }

    public void setRecord_id(String record_id) {
        this.record_id = record_id;
    }
    
    public String getProjectName() {
        return project_name;
    }

    public void setProjectName(String project_name) {
        this.project_name = project_name;
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
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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
