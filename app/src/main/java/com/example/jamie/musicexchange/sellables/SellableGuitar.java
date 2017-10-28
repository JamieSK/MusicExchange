package com.example.jamie.musicexchange.sellables;

import com.example.jamie.musicexchange.behaviours.Playable;
import com.example.jamie.musicexchange.behaviours.Sellable;
import com.example.jamie.musicexchange.enums.ElectroAcoustic;
import com.example.jamie.musicexchange.enums.SellCategory;
import com.example.jamie.musicexchange.instruments.Guitar;

/**
 * Created by jamie on 27/10/2017.
 */

public class SellableGuitar extends Guitar implements Playable, Sellable {
  private double costPrice;
  private double sellPrice;

  public SellableGuitar(double costPrice, double sellPrice, int numberOfStrings, String material, String colour, ElectroAcoustic electroAcoustic) {
    this.costPrice = costPrice;
    this.sellPrice = sellPrice;
    super.numberOfStrings = numberOfStrings;
    super.material = material;
    super.colour = colour;
    super.electroAcoustic = electroAcoustic;
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
