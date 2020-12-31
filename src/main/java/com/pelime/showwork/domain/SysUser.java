package com.pelime.showwork.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class SysUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;

    @Column(length = 20,nullable = false)
    private String realName;

    @Column(length = 20,nullable = false,unique = true)
    private String username;

    @Column(length = 100,nullable = false)
    private String password;

    @Column(length = 11,nullable = false)
    private String departmentNumber;

    @Column(length = 20)
    private String phoneNum;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "sys_user_role",joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name ="role_id" ))
    private List<SysRole> roles;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(String departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public List<SysRole> getRoles() {
        return roles;
    }

    public void setRoles(List<SysRole> roles) {
        this.roles = roles;
    }
}
