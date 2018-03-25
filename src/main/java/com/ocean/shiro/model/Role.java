package com.ocean.shiro.model;

import java.util.Date;

public class Role {
    private Integer roleId;

    private String roleCode;

    private String roleName;

    private Integer status;

    private String remark;

    private Date createTime;

    private Date operateTime;

    private String operateUser;

    private String operateIp;

    public Role(Integer roleId, String roleCode, String roleName, Integer status, String remark, Date createTime, Date operateTime, String operateUser, String operateIp) {
        this.roleId = roleId;
        this.roleCode = roleCode;
        this.roleName = roleName;
        this.status = status;
        this.remark = remark;
        this.createTime = createTime;
        this.operateTime = operateTime;
        this.operateUser = operateUser;
        this.operateIp = operateIp;
    }

    public Role() {
        super();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
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