package com.example.alice.rays_music_exchange;

import static com.example.alice.rays_music_exchange.InstrumentType.STRING;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

/**
 * Created by alice on 09/09/2017.
 */

public class InstrumentTest {
    Guitar guitar;
    Piano piano;

    @Before
    public void before(){
        guitar = new Guitar(STRING, "Medium", 6, 150.00, 200.00);
        piano = new Piano(InstrumentType.KEYED, "Large", "Grand", 700.00, 1000.00);
    }

    @Test
    public void testGuitarSize(){
        assertEquals("Medium", guitar.getSize());
    }

    @Test
    public void testGuitarType(){
        assertEquals(STRING, guitar.getType());
    }

    @Test
    public void testGuitarStrings(){
        assertEquals(6, guitar.getNumStrings());
    }

    @Test
    public void testGuitarPlays(){
        assertEquals("strum", guitar.play());
    }

    @Test
    public void testPianoPianoType(){
        assertEquals("Grand", piano.getPianoType());
    }

    @Test
    public void testPianoPlays(){
        assertEquals("plinky plonk", piano.play());
    }

    @Test
    public void testGuitarProfit(){
        assertEquals(50.00, guitar.profit(), 0.01);
    }





}
