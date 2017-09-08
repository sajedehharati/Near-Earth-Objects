package com.nearearthobject.web.exception;

public class Forbiddenexception extends RuntimeException {
  private static final long serialVersionUID = -3187283988112642076L;

  public Forbiddenexception(Throwable cause) {
    super(cause);
  }

  public Forbiddenexception(String msg, Throwable cause) {
    super(msg, cause);
  }

  public Forbiddenexception(String msg) {
    super(msg);
  }
}
