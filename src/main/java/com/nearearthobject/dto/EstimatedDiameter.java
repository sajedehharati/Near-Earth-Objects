package com.nearearthobject.dto;

public class EstimatedDiameter {
  private Kilometers kilometers;
  private Meters meters;
  private Miles miles;
  private Feet feet;

  public EstimatedDiameter() {

  }

  public Kilometers getKilometers() {
    return kilometers;
  }

  public void setKilometers(Kilometers kilometers) {
    this.kilometers = kilometers;
  }

  public Meters getMeters() {
    return meters;
  }

  public void setMeters(Meters meters) {
    this.meters = meters;
  }

  public Miles getMiles() {
    return miles;
  }

  public void setMiles(Miles miles) {
    this.miles = miles;
  }

  public Feet getFeet() {
    return feet;
  }

  public void setFeet(Feet feet) {
    this.feet = feet;
  }

}
