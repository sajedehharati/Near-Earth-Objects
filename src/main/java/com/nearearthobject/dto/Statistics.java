package com.nearearthobject.dto;

import java.util.ArrayList;

public class Statistics {
  //optional
  private ArrayList<Link> links;
  //Number of NearEarthObjects listed in NeoWs,
  private Integer near_earth_object_count;
  // Number of Close Approach listings across all NEOs listed in NeoWs,
  private Integer closeApproachCount;
  //TimeStamp the last time the DB was updated,
  private String lastUpdated;

  private String source;

  private Object nasaJplUrl;

  public Statistics() {

  }

  public Statistics(int nearEarthObjectCount, int closeApproachCount, String lastUpdated) {
    this.near_earth_object_count = nearEarthObjectCount;
    this.closeApproachCount = closeApproachCount;
    this.lastUpdated = lastUpdated;
  }

  public ArrayList<Link> getLinks() {
    return links;
  }

  public void setLinks(ArrayList<Link> links) {
    this.links = links;
  }

  public int getNearEarthObjectCount() {
    return near_earth_object_count;
  }

  public void setNearEarthObjectCount(int nearEarthObjectCount) {
    this.near_earth_object_count = nearEarthObjectCount;
  }

  public int getCloseApproachCount() {
    return closeApproachCount;
  }

  public void setCloseApproachCount(int closeApproachCount) {
    this.closeApproachCount = closeApproachCount;
  }

  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public Object getNasaJplUrl() {
    return nasaJplUrl;
  }

  public void setNasaJplUrl(Object nasaJplUrl) {
    this.nasaJplUrl = nasaJplUrl;
  }

}
