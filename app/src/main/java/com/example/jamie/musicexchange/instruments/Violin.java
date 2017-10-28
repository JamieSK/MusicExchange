package com.example.jamie.musicexchange.instruments;

import com.example.jamie.musicexchange.Instrument;
import com.example.jamie.musicexchange.enums.InstrumentTypes;
import com.example.jamie.musicexchange.enums.SellCategory;

/**
 * Created by jamie on 27/10/2017.
 */

public abstract class Violin extends Instrument {
  protected String bow;

  protected Violin() {
    super.instrumentType = InstrumentTypes.STRING;
  }

  @Override
  public String play() {
    return "Plaintive violin.";
  }

  public String getBow() {
    return bow;
  }
}
