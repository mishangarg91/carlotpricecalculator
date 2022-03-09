package com.cars.republic.model;

public class CarLot {
  private int carNo;
  private int basePrice;
  private String color;
  private int noOfWheel;
  private boolean amphibious;
  private double price;

  public int getCarNo() {
    return carNo;
  }

  public void setCarNo(int carNo) {
    this.carNo = carNo;
  }

  public int getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(int basePrice) {
    this.basePrice = basePrice;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getNoOfWheel() {
    return noOfWheel;
  }

  public void setNoOfWheel(int noOfWheel) {
    this.noOfWheel = noOfWheel;
  }

  public boolean isAmphibious() {
    return amphibious;
  }

  public void setAmphibious(boolean amphibious) {
    this.amphibious = amphibious;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}