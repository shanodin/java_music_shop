package com.example.alice.rays_music_exchange;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.*;

/**
 * Created by alice on 10/09/2017.
 */

public class ShopTest {
    Product product1;
    Product product2;
    Guitar guitar;
    Shop shop1;

    @Before
    public void before(){
        product1 = new Product("Sheet Music", 5.00, 10.00);
        product2 = new Product("Guitar String", 10.00, 18.00);
        guitar = new Guitar(InstrumentType.STRING, "Medium", 6, 150.00, 200.00);
        shop1 = new Shop(100.00);
    }

    @Test
    public void testShopStockEmpty(){
        assertEquals(0, shop1.getStockList().size());
    }

    @Test
    public void testAddItem(){
        shop1.addToStock(product1);
        assertEquals(1, shop1.getStockList().size());
    }

    @Test
    public void testAddTwoItems(){
        shop1.addToStock(product1);
        shop1.addToStock(product2);
        assertEquals(2, shop1.getStockList().size());
    }

    @Test
    public void testSellItem(){
        shop1.addToStock(product1);
        shop1.addToStock(product2);
        shop1.sellProduct(product1);
        assertEquals(105.00, shop1.getFunds());
        assertEquals(1, shop1.getStockList().size());
    }

    @Test
    public void testDoesntAlwaysSellFirstItem(){
        shop1.addToStock(product1);
        shop1.addToStock(product2);
        shop1.addToStock(guitar);
        shop1.sellProduct(guitar);
        assertEquals(150.00, shop1.getFunds());
        assertEquals(2, shop1.getStockList().size());
    }

    @Test
    public void testTotalProfit(){
        shop1.addToStock(product1);
        shop1.addToStock(product2);
        shop1.addToStock(guitar);
        assertEquals(63.00, shop1.getTotalProfit());
    }
}
