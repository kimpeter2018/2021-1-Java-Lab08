package edu.handong.csee.java.hw3.converters;

/**
 * Allconverter class
 */
public class AllConverter {
  private double value;
  private String originalMeasure;
  private double convertedValue1;
  private double convertedValue2;

/**
 * @param fromValue the from value
 * @return
 */
  public AllConverter setFromValue(double fromValue) {
    this.value = fromValue;
    return this;
  }

/**
 * @param originalMeasure original
 * @return
 */
  public AllConverter setOriginalMeasure(String originalMeasure) {
    this.originalMeasure = originalMeasure;
    return this;
  }

  /**
   * convert the original measure to all convertible
   */
  public void convertAndPrintOut() {
    if (this.originalMeasure.equals("KM")) {
      convertedValue1 = this.value * 1000;
      convertedValue2 = this.value / 1.6;

      System.out.println(this.value + " " + this.originalMeasure + " to " + convertedValue1 + " M");
      System.out.println(this.value + " " + this.originalMeasure + " to " + convertedValue2 + " MILE");
    } else if (this.originalMeasure.equals("TON")) {
      convertedValue1 = this.value * 1000;
      convertedValue2 = this.value * 1000000;

      System.out.println(this.value + " " + this.originalMeasure + " to " + convertedValue1 + " KG");
      System.out.println(this.value + " " + this.originalMeasure + " to " + convertedValue2 + " G");
    } else {
      System.out.println("AllConverter cannot support the measure!");
    }
  }
}
