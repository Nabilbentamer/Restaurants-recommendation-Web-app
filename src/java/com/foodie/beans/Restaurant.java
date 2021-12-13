package com.foodie.beans;


public class Restaurant {
        private String location;
    private String name;
    private String image;
    private String establishment_type;
    private String restaurant_features;
    private String price;
    private String cuisine;
    private String good_for;
    private int id;

    public Restaurant() {
    }

    public Restaurant(String location, String name, String image, String establishment_type, String restaurant_features, String price, String cuisine, String good_for, int id) {
        this.location = location;
        this.name = name;
        this.image = image;
        this.establishment_type = establishment_type;
        this.restaurant_features = restaurant_features;
        this.price = price;
        this.cuisine = cuisine;
        this.good_for = good_for;
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getEstablishment_type() {
        return establishment_type;
    }

    public String getRestaurant_features() {
        return restaurant_features;
    }

    public String getPrice() {
        return price;
    }

    public String getCuisine() {
        return cuisine;
    }

    public String getGood_for() {
        return good_for;
    }

    public int getId() {
        return id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setEstablishment_type(String establishment_type) {
        this.establishment_type = establishment_type;
    }

    public void setRestaurant_features(String restaurant_features) {
        this.restaurant_features = restaurant_features;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public void setGood_for(String good_for) {
        this.good_for = good_for;
    }

    public void setId(int id) {
        this.id = id;
    }


    
}
