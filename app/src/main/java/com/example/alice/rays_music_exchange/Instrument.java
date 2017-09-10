package com.example.alice.rays_music_exchange;

/**
 * Created by alice on 09/09/2017.
 */

public abstract class Instrument
        implements Playable{
    InstrumentType type;
    String size;
    double cost;
    double price;

    public Instrument(InstrumentType type, String size, double cost, double price) {
        this.type = type;
        this.size = size;
        this.cost = cost;
        this.price = price;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public abstract String play();
}
