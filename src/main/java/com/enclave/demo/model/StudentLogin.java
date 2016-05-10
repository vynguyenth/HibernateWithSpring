package com.enclave.demo.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class StudentLogin {

    @NotEmpty
    @Size(min=4, max=20)
    private String userName;
        
    @NotEmpty
    @Size(min=4, max=8)
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
