package com.example.alice.rays_music_exchange;

import java.util.ArrayList;

/**
 * Created by alice on 10/09/2017.
 */

public class Shop {
    ArrayList<Saleable> stockList;
    double funds;

    public Shop(double funds){
        this.stockList = new ArrayList<Saleable>();
        this.funds = funds;
    }

    public ArrayList<Saleable> getStockList() {
        return stockList;
    }

    public void addToStock(Saleable product){
        stockList.add(product);
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public void sellProduct(Saleable product) {
       int index = stockList.indexOf(product);
        stockList.remove(index);
        double newFunds = funds + product.profit();
        this.setFunds(newFunds);
    }
}
