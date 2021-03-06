package com.example.jamie.musicexchange.sellables;

import com.example.jamie.musicexchange.behaviours.Sellable;
import com.example.jamie.musicexchange.enums.SellCategory;

/**
 * Created by jamie on 27/10/2017.
 */

public class SheetMusic implements Sellable {
  private double costPrice;
  private double sellPrice;
  private SellCategory category = SellCategory.SHEET_MUSIC;

  public SheetMusic(double costPrice, double sellPrice) {
    this.costPrice = costPrice;
    this.sellPrice = sellPrice;
  }

  @Override
  public double getCostPrice() {
    return costPrice;
  }

  @Override
  public double getSellPrice() {
    return sellPrice;
  }

  @Override
  public double calculateMarkup() {
    return sellPrice - costPrice;
  }
}
