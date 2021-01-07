package com.foodie.beans;


public class Member {
    
    private String uname,email,password;

    public Member(String uname, String email, String password) {
        this.uname = uname;
        this.email = email;
        this.password = password;
    }

    public Member() {
    }

    public String getUname() {
        return uname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
}

