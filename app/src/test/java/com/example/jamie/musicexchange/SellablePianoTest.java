package com.example.jamie.musicexchange;

import com.example.jamie.musicexchange.enums.ElectroAcoustic;
import com.example.jamie.musicexchange.sellables.SellablePiano;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jamie on 27/10/2017.
 */

public class SellablePianoTest {
  private SellablePiano piano;

  @Before
  public void before() {
    piano = new SellablePiano(2000, 8000, "Grand", "Gold", "Golden", ElectroAcoustic.ACOUSTIC);
  }

  @Test
  public void calculateMarkup() {
    assertEquals(6000, piano.calculateMarkup(), 0.01);
  }

  @Test
  public void getSize() {
    assertEquals("Grand", piano.getSize());
  }

  @Test
  public void play() {
    assertEquals("Plink plonk pliano.", piano.play());
  }

  @Test
  public void getCostPrice() {
    assertEquals(2000, piano.getCostPrice(), 0.01);
  }

  @Test
  public void getSellPrice() {
    assertEquals(8000, piano.getSellPrice(), 0.01);
  }
}
