package com.example.jamie.musicexchange.instruments;

import com.example.jamie.musicexchange.Instrument;
import com.example.jamie.musicexchange.enums.InstrumentTypes;
import com.example.jamie.musicexchange.enums.SellCategory;

/**
 * Created by jamie on 27/10/2017.
 */

public abstract class Guitar extends Instrument {
  protected int numberOfStrings;

  protected Guitar() {
    super.instrumentType = InstrumentTypes.STRING;
  }

  @Override
  public String play() {
    return "Guitar tunes.";
  }

  public int getNumberOfStrings() {
    return this.numberOfStrings;
  }
}
