
package com.foodie.beans;


public class Rating {
    
             int id, id_user, id_restau, value;

    public Rating() {
    }

    public Rating(int id, int id_user, int id_restau, int value) {
        this.id = id;
        this.id_user = id_user;
        this.id_restau = id_restau;
        this.value = value;
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

    public int getValue() {
        return value;
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

    public void setValue(int value) {
        this.value = value;
    }
             
             
         
         
    
}
