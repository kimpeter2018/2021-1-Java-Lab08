package edu.handong.csee.java.hw3.converters;

/**
 * this is the interface of all the convert classes
 */
public interface Convertible {

    /**
     * set starting value
     */
    public void setFromValue(double fromValue);

    /**
     * get converted value
     */
    public double getConvertedValue();

    /**
     * converting method from original value to target value
     */
    public void convert();
}