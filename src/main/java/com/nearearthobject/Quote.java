package com.nearearthobject;

import com.fasterxml.jackson.annotation.JsonView;
import com.nearearthobject.view.NearObjectView;

public class Quote {
  @JsonView(NearObjectView.class)
  private String type;
  @JsonView(NearObjectView.class)
  private Value value;

  public Quote() {
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Value getValue() {
    return value;
  }

  public void setValue(Value value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Quote{" +
          "type='" + type + '\'' +
          ", value=" + value +
          '}';
  }
}
