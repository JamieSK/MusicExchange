package com.example.jamie.musicexchange;

import com.example.jamie.musicexchange.enums.ElectroAcoustic;
import com.example.jamie.musicexchange.enums.InstrumentTypes;
import com.example.jamie.musicexchange.enums.SellCategory;
import com.example.jamie.musicexchange.sellables.SellableGuitar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jamie on 27/10/2017.
 */

public class SellableGuitarTest {
  private SellableGuitar guitar;

  @Before
  public void before() {
    guitar = new SellableGuitar(500, 1500, 6, "Koa", "Brown", ElectroAcoustic.ACOUSTIC);
  }

  @Test
  public void calculateMarkup() {
    assertEquals(1000, guitar.calculateMarkup(), 0.01);
  }

  @Test
  public void getNumberOfStrings() {
    assertEquals(6, guitar.getNumberOfStrings());
  }

  @Test
  public void getSellCategory() {
    assertEquals(SellCategory.INSTRUMENT, guitar.getSellCategory());
  }

  @Test
  public void getInstrumentType() {
    assertEquals(InstrumentTypes.STRING, guitar.getInstrumentType());
  }

  @Test
  public void play() {
    assertEquals("Guitar tunes.", guitar.play());
  }

  @Test
  public void getMaterial() {
    assertEquals("Koa", guitar.getMaterial());
  }

  @Test
  public void getColour() {
    assertEquals("Brown", guitar.getColour());
  }

  @Test
  public void getElectroAcoustic() {
    assertEquals(ElectroAcoustic.ACOUSTIC, guitar.getElectroAcoustic());
  }

  @Test
  public void getCostPrice() {
    assertEquals(500, guitar.getCostPrice(), 0.01);
  }

  @Test
  public void getSellPrice() {
    assertEquals(1500, guitar.getSellPrice(), 0.01);
  }
}
