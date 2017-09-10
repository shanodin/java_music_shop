package com.example.alice.rays_music_exchange;

/**
 * Created by alice on 09/09/2017.
 */

public class Guitar
        extends Instrument
        implements Saleable {

    private int numStrings;

    public Guitar(InstrumentType type, String size, int numStrings, double cost, double price){
        super(type, size, cost, price);
        this.type = type;
        this.size = size;
        this.numStrings = numStrings;
        this.cost = cost;
        this.price = price;
    }

    @Override
    public String play() {
        return "strum";
    }

    public int getNumStrings() {
        return numStrings;
    }

    public double profit(){
        return price - cost;
    }
}
