/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodie.beans;

/**
 *
 * @author hp
 */
public class Comment{ 
        
         int id, id_user, id_restau;
         
         private String content, title, status, date;
         private String title1, title2;

    public Comment(int id, int id_user, int id_restau, String content, String title, String status, String Dt_comment) {
        this.id = id;
        this.id_user = id_user;
        this.id_restau = id_restau;
        this.content = content;
        this.title = title;
        this.status = status;
        this.date = Dt_comment;
    }

    public Comment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setId_restau(int id_restau) {
        this.id_restau = id_restau;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId_user() {
        return id_user;
    }

    public int getId_restau() {
        return id_restau;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public String getDate() {
        return date;
    }
         
         

         
        
    
}
