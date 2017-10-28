package com.example.jamie.musicexchange;

import com.example.jamie.musicexchange.sellables.SheetMusic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jamie on 27/10/2017.
 */

public class SheetMusicTest {
  private SheetMusic sheets;

  @Before
  public void before() {
    sheets = new SheetMusic(5, 10);
  }

  @Test
  public void calculateMarkup() {
    assertEquals(5, sheets.calculateMarkup(), 0.01);
  }

  @Test
  public void getCostPrice() {
    assertEquals(5, sheets.getCostPrice(), 0.01);
  }

  @Test
  public void getSellPrice() {
    assertEquals(10, sheets.getSellPrice(), 0.01);
  }
}
