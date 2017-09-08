package com.nearearthobject.dto;

public class Links {

  private String next;
  private String self;

  public Links() {

  }

  public Links(String next, String self) {
    this.next = next;
    this.self = self;
  }

  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

}
