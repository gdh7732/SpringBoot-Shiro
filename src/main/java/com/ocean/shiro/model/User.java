package com.ocean.shiro.model;

import java.util.Date;

public class User {
    private Integer userId;

    private String name;

    private Integer age;

    private Integer phoneNumber;

    private String password;

    private Integer deptId;

    private String mail;

    private Integer status;

    private String remark;

    private Date createTime;

    private Date operateTime;

    private String operateUser;

    private String operateIp;

    public User(Integer userId, String name, Integer age, Integer phoneNumber, String password, Integer deptId, String mail, Integer status, String remark, Date createTime, Date operateTime, String operateUser, String operateIp) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.deptId = deptId;
        this.mail = mail;
        this.status = status;
        this.remark = remark;
        this.createTime = createTime;
        this.operateTime = operateTime;
        this.operateUser = operateUser;
        this.operateIp = operateIp;
    }

    public User() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser == null ? null : operateUser.trim();
    }

    public String getOperateIp() {
        return operateIp;
    }

    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp == null ? null : operateIp.trim();
    }
}