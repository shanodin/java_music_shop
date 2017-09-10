package com.example.alice.rays_music_exchange;

/**
 * Created by alice on 09/09/2017.
 */

public class Piano extends Instrument {
    private String pianoType;

    public Piano(InstrumentType type, String size, String pianoType, double cost, double price) {
        super(type, size, cost, price);
        this.type = type;
        this.size = size;
        this.pianoType = pianoType;
        this.cost = cost;
        this.price = price;
    }

    @Override
    public String play () {
        return "plinky plonk";
    }

    public String getPianoType() {
        return pianoType;
    }

    public double profit(){
        return price - cost;
    }
}