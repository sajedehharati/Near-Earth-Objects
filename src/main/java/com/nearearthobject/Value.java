package com.nearearthobject;

import com.fasterxml.jackson.annotation.JsonView;
import com.nearearthobject.view.NearObjectView;

public class Value {
  @JsonView(NearObjectView.class)
  private Long id;
  @JsonView(NearObjectView.class)
  private String quote;

  public Value() {
  }

  public Long getId() {
    return this.id;
  }

  public String getQuote() {
    return this.quote;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setQuote(String quote) {
    this.quote = quote;
  }

  @Override
  public String toString() {
    return "Value{" +
          "id=" + id +
          ", quote='" + quote + '\'' +
          '}';
  }
}
