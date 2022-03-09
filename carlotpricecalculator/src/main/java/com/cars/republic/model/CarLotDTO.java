package com.cars.republic.model;

public class CarLotDTO {

  private String carNo;
  private String basePrice;
  private String color;
  private String noOfWheel;
  private String amphibious;
  
  public CarLotDTO(String carNo, String basePrice, String color, String noOfWheel,
      String amphibious) {
    super();
    this.carNo = carNo;
    this.basePrice = basePrice;
    this.color = color;
    this.noOfWheel = noOfWheel;
    this.amphibious = amphibious;
  }

  public String getCarNo() {
    return carNo;
  }

  public void setCarNo(String carNo) {
    this.carNo = carNo;
  }

  public String getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(String basePrice) {
    this.basePrice = basePrice;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getNoOfWheel() {
    return noOfWheel;
  }

  public void setNoOfWheel(String noOfWheel) {
    this.noOfWheel = noOfWheel;
  }

  public String getAmphibious() {
    return amphibious;
  }

  public void setAmphibious(String amphibious) {
    this.amphibious = amphibious;
  }

  @Override
  public String toString() {
    return "CarLotDTO [carNo=" + carNo + ", basePrice=" + basePrice + ", color=" + color
        + ", noOfWheel=" + noOfWheel + ", amphibious=" + amphibious + "]";
  }
}
