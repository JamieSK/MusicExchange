package com.example.jamie.musicexchange.instruments;

import com.example.jamie.musicexchange.Instrument;
import com.example.jamie.musicexchange.enums.InstrumentTypes;
import com.example.jamie.musicexchange.enums.SellCategory;

/**
 * Created by jamie on 27/10/2017.
 */

public abstract class Piano extends Instrument {
  protected String size;

  protected Piano() {
    super.instrumentType = InstrumentTypes.PERCUSSION;
  }

  @Override
  public String play() {
    return "Plink plonk pliano.";
  }

  public String getSize() {
    return size;
  }
}
