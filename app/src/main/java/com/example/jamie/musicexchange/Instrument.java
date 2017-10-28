package com.example.jamie.musicexchange;

import com.example.jamie.musicexchange.behaviours.Playable;
import com.example.jamie.musicexchange.enums.ElectroAcoustic;
import com.example.jamie.musicexchange.enums.InstrumentTypes;
import com.example.jamie.musicexchange.enums.SellCategory;

/**
 * Created by jamie on 27/10/2017.
 */

public abstract class Instrument implements Playable {
  protected String material;
  protected String colour;
  protected InstrumentTypes instrumentType;
  protected ElectroAcoustic electroAcoustic;
  private SellCategory sellCategory = SellCategory.INSTRUMENT;

  protected String getMaterial() {
    return material;
  }

  protected String getColour() {
    return colour;
  }

  protected ElectroAcoustic getElectroAcoustic() {
    return electroAcoustic;
  }

  protected InstrumentTypes getInstrumentType() {
    return instrumentType;
  }

  protected SellCategory getSellCategory() {
    return sellCategory;
  }
}
