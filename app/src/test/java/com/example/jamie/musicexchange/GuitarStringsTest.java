package com.example.jamie.musicexchange;

import com.example.jamie.musicexchange.sellables.GuitarStrings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jamie on 27/10/2017.
 */

public class GuitarStringsTest {
  private GuitarStrings strings;

  @Before
  public void before() {
    strings = new GuitarStrings(5, 10);
  }

  @Test
  public void calculateMarkup() {
    assertEquals(5, strings.calculateMarkup(), 0.01);
  }

  @Test
  public void getCostPrice() {
    assertEquals(5, strings.getCostPrice(), 0.01);
  }

  @Test
  public void getSellPrice() {
    assertEquals(10, strings.getSellPrice(), 0.01);
  }
}
