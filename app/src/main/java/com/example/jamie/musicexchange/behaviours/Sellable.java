package com.example.jamie.musicexchange.behaviours;

/**
 * Created by jamie on 27/10/2017.
 */

public interface Sellable {
  double getCostPrice();
  double getSellPrice();
  double calculateMarkup();
}
