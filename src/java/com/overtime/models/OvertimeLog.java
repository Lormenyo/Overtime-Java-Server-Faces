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
public class OvertimeLog {
    
    
    private String record_id;
    private String project;
    private String requester;
    private Date  firstLevelApprovalDate;
    private String firstLevelApprovalBy;
    private Date  secondLevelApprovalDate;
    private String secondLevelApprovalBy;
    private String status;

    public String getRecord_id() {
        return record_id;
    }

    public void setRecord_id(String record_id) {
        this.record_id = record_id;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getRequester() {
        return requester;
    }

    public void setRequester(String requester) {
        this.requester = requester;
    }

    public Date getFirstLevelApprovalDate() {
        return firstLevelApprovalDate;
    }

    public void setFirstLevelApprovalDate(Date firstLevelApprovalDate) {
        this.firstLevelApprovalDate = firstLevelApprovalDate;
    }

    public String getFirstLevelApprovalBy() {
        return firstLevelApprovalBy;
    }

    public void setFirstLevelApprovalBy(String firstLevelApprovalBy) {
        this.firstLevelApprovalBy = firstLevelApprovalBy;
    }

    public Date getSecondLevelApprovalDate() {
        return secondLevelApprovalDate;
    }

    public void setSecondLevelApprovalDate(Date secondLevelApprovalDate) {
        this.secondLevelApprovalDate = secondLevelApprovalDate;
    }

    public String getSecondLevelApprovalBy() {
        return secondLevelApprovalBy;
    }

    public void setSecondLevelApprovalBy(String secondLevelApprovalBy) {
        this.secondLevelApprovalBy = secondLevelApprovalBy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
