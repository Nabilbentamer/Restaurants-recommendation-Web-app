/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodie.beans;


public class Favorite_restaurant {
    
    int id, id_user, id_restau;

    public Favorite_restaurant() {
    }

    public Favorite_restaurant(int id, int id_user, int id_restau) {
        this.id = id;
        this.id_user = id_user;
        this.id_restau = id_restau;
    }

    public int getId() {
        return id;
    }

    public int getId_user() {
        return id_user;
    }

    public int getId_restau() {
        return id_restau;
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
    
    
}
