package com.example.jamie.musicexchange;

import com.example.jamie.musicexchange.behaviours.Sellable;

import java.util.ArrayList;

/**
 * Created by jamie on 27/10/2017.
 */

public class Shop {
  private ArrayList<Sellable> stock;

  public Shop(ArrayList<Sellable> stock) {
    this.stock = stock;
  }

  public ArrayList<Sellable> getStock() {
    return stock;
  }

  public void addToStock(Sellable item) {
    stock.add(item);
  }

  public Sellable remove(int index) {
    return stock.remove(index);
  }

  public double totalProfit() {
    double total = 0;
    for (Sellable item : stock) {
      total += item.calculateMarkup();
    }
    return total;
  }
}
