package com.foodie.beans;


public class Member {
    
    private String uname,email,password, base64image;
    private String bio,state,city,phone,gender,birthday;
    public void setBase64image(String base64image) {
        this.base64image = base64image;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBio() {
        return bio;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public Member(String uname, String email, String password, String base64image, String bio, String state, String city, String phone, String gender, String birthday, int id) {
        this.uname = uname;
        this.email = email;
        this.password = password;
        this.base64image = base64image;
        this.bio = bio;
        this.state = state;
        this.city = city;
        this.phone = phone;
        this.gender = gender;
        this.birthday = birthday;
        this.id = id;
    }

    public String getBase64image() {
        return base64image;
    }
    int id;

    public Member(String uname, String email, String password) {
        this.uname = uname;
        this.email = email;
        this.password = password;
    }

    public Member(String uname, String email, String password, int id) {
        this.uname = uname;
        this.email = email;
        this.password = password;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

