package com.example.jamie.musicexchange;

import com.example.jamie.musicexchange.behaviours.Sellable;
import com.example.jamie.musicexchange.enums.ElectroAcoustic;
import com.example.jamie.musicexchange.sellables.SellableGuitar;
import com.example.jamie.musicexchange.sellables.SellablePiano;
import com.example.jamie.musicexchange.sellables.SellableViolin;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by jamie on 27/10/2017.
 */

public class ShopTest {
  private Shop shop;
  private SellableGuitar guitar;
  private SellablePiano piano;
  private SellableViolin violin;

  @Before
  public void before() {
    shop = new Shop(new ArrayList<Sellable>());
    guitar = new SellableGuitar(500, 1500, 6, "Koa", "Brown", ElectroAcoustic.ACOUSTIC);
    piano = new SellablePiano(2000, 8000, "Grand", "Gold", "Golden", ElectroAcoustic.ACOUSTIC);
    violin = new SellableViolin(750, 2000, "Archery", "Leather", "Turquoise", ElectroAcoustic.ELECTROACOUSTIC);
  }

  @Test
  public void addStock() {
    shop.addToStock(guitar);
    assertEquals(true, shop.getStock().contains(guitar));
  }

  @Test
  public void removeStock() {
    shop.addToStock(guitar);
    assertEquals(true, shop.getStock().contains(guitar));
    assertEquals(guitar, shop.remove(0));
    assertEquals(false, shop.getStock().contains(guitar));
  }

  @Test
  public void totalProfit() {
    shop.addToStock(guitar);
    shop.addToStock(piano);
    shop.addToStock(violin);
    assertEquals(8250, shop.totalProfit(), 0.01);
  }
}
