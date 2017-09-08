package com.nearearthobject.dto;

import java.util.List;

public class NearEarthObject {

  private Links links;

  private boolean is_potentially_hazardous_asteroid;
  //The reference ID of the Asteroid - This correlates to the SPK ID for the JPL NEO data,
  private String neo_reference_id;

  private String name;
  //(string, optional): A Link to the NASA JPL Small-Body Database website,
  private String nasa_jpl_url;
  //(number, optional): Is a measure of an asteroids brightness,
  private int absolute_magnitude_h;

  //(object, optional): A collection of estimated diameters (kilometers, meters, miles, feet,
  private EstimatedDiameter estimated_diameter;

  //(Array[CloseApproachData], optional): Close approach information of the Asteroid,
  private List<CloseApproachData> close_approach_data;

  private OrbitalData orbital_data;

  public NearEarthObject() {

  }
  public boolean isIs_potentially_hazardous_asteroid() {
    return is_potentially_hazardous_asteroid;
  }

  public void setIs_potentially_hazardous_asteroid(boolean is_potentially_hazardous_asteroid) {
    this.is_potentially_hazardous_asteroid = is_potentially_hazardous_asteroid;
  }

  public String getNeo_reference_id() {
    return neo_reference_id;
  }

  public void setNeo_reference_id(String neo_reference_id) {
    this.neo_reference_id = neo_reference_id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNasa_jpl_url() {
    return nasa_jpl_url;
  }

  public void setNasa_jpl_url(String nasa_jpl_url) {
    this.nasa_jpl_url = nasa_jpl_url;
  }

  public int getAbsolute_magnitude_h() {
    return absolute_magnitude_h;
  }

  public void setAbsolute_magnitude_h(int absolute_magnitude_h) {
    this.absolute_magnitude_h = absolute_magnitude_h;
  }

  public EstimatedDiameter getEstimated_diameter() {
    return estimated_diameter;
  }

  public void setEstimated_diameter(EstimatedDiameter estimated_diameter) {
    this.estimated_diameter = estimated_diameter;
  }

  public List<CloseApproachData> getClose_approach_data() {
    return close_approach_data;
  }

  public void setClose_approach_data(List<CloseApproachData> close_approach_data) {
    this.close_approach_data = close_approach_data;
  }

  public OrbitalData getOrbital_data() {
    return orbital_data;
  }

  public void setOrbital_data(OrbitalData orbital_data) {
    this.orbital_data = orbital_data;
  }
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

}
