package com.nearearthobject.dto;

public class Link {

  private String rel;
  private String href;
  private boolean templated;

  public Link() {
    //Empty constructor
  }

  public Link(String rel, String href, boolean templated) {

    this.rel = rel;
    this.href = href;
    this.templated = templated;
  }

  public String getRel() {
    return rel;
  }

  public void setRel(final String rel) {
    this.rel = rel;
  }

  public String getHref() {
    return href;
  }

  public void setHref(final String href) {
    this.href = href;
  }

  public boolean isTemplated() {
    return templated;
  }

  public void setTemplated(final boolean templated) {
    this.templated = templated;
  }

}
