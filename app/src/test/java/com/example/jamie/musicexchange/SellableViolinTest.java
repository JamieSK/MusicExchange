package com.example.jamie.musicexchange;

import com.example.jamie.musicexchange.enums.ElectroAcoustic;
import com.example.jamie.musicexchange.sellables.SellableViolin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jamie on 27/10/2017.
 */

public class SellableViolinTest {
  private SellableViolin violin;

  @Before
  public void before() {
    violin = new SellableViolin(750, 2000, "Archery", "Leather", "Turquoise", ElectroAcoustic.ELECTROACOUSTIC);
  }

  @Test
  public void calculateMarkup() {
    assertEquals(1250, violin.calculateMarkup(), 0.01);
  }

  @Test
  public void getBow() {
    assertEquals("Archery", violin.getBow());
  }

  @Test
  public void play() {
    assertEquals("Plaintive violin.", violin.play());
  }

  @Test
  public void getCostPrice() {
    assertEquals(750, violin.getCostPrice(), 0.01);
  }

  @Test
  public void getSellPrice() {
    assertEquals(2000, violin.getSellPrice(), 0.01);
  }
}
