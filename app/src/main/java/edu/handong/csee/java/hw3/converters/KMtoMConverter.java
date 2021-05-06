package edu.handong.csee.java.hw3.converters;

/**
 * this class converts Km to m
 */
public class KMtoMConverter implements Convertible {
  private double value;

  /**
   * set starting value
   */
  public void setFromValue(double fromValue) {
    value = fromValue;
  }

  /**
   * get converted value
   */
  public double getConvertedValue() {
    return value;
  }

  /**
   * converting method of ton to kg
   */
  public void convert() {
    value = value * 1000;
  }

}