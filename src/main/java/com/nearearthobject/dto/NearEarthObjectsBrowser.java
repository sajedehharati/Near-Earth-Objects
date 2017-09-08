package com.nearearthobject.dto;

import java.util.ArrayList;

public class NearEarthObjectsBrowser {

  private Links links;
  private Page page;
  private ArrayList<NearEarthObject> near_earth_objects;

  public NearEarthObjectsBrowser(Links links, Page page, ArrayList<NearEarthObject> nearEarthObject) {

    this.links = links;
    this.page = page;
    this.near_earth_objects = nearEarthObject;
  }

  public NearEarthObjectsBrowser() {

  }

  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
    this.page = page;
  }

  public ArrayList<NearEarthObject> getNearEarthObject() {
    return near_earth_objects;
  }

  public void setNearEarthObject(ArrayList<NearEarthObject> nearEarthObject) {
    this.near_earth_objects = nearEarthObject;
  }

}
