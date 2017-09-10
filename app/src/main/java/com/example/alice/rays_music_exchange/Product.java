package com.example.alice.rays_music_exchange;

/**
 * Created by alice on 09/09/2017.
 */

public class Product
        implements Saleable {
    public String name;
    public double cost;
    public double price;

    public Product(String name, double cost, double price){
        this.name = name;
        this.cost = cost;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public double getPrice() {
        return price;
    }

    public double profit(){
        return this.price - this.cost;
    }
}
