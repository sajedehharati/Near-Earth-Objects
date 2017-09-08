package com.nearearthobject.dto;

public class Page {
  private int size;
  private int total_elements;
  private int total_pages;
  private int number;

  public Page() {

  }

  public Page(int size, int total_elements, int total_pages, int number) {
    this.size = size;
    this.total_elements = total_elements;
    this.total_pages = total_pages;
    this.number = number;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public int getTotal_elements() {
    return total_elements;
  }

  public void setTotal_elements(int total_elements) {
    this.total_elements = total_elements;
  }

  public int getTotal_pages() {
    return total_pages;
  }

  public void setTotal_pages(int total_pages) {
    this.total_pages = total_pages;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

}
