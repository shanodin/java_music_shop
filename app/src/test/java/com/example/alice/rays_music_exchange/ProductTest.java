package com.example.alice.rays_music_exchange;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by alice on 09/09/2017.
 */

public class ProductTest {
    Product product1;
    Product product2;

    @Before
    public void before(){
        product1 = new Product("Sheet Music", 5.00, 10.00);
        product2 = new Product("Guitar String", 10.00, 18.00);
    }

    @Test
    public void testProductName(){
        assertEquals("Sheet Music", product1.getName());
    }

    @Test
    public void testProuctPricce(){
        assertEquals(10.00, product1.getPrice());
    }

    @Test
    public void testProductCost(){
        assertEquals(5.00, product1.getCost());
    }

    @Test
    public void testProductProfit(){
        assertEquals(8.00, product2.profit());
    }

}
