package com.nearearthobject.web.exception;

public class NotFoundException extends RuntimeException {
  private static final long serialVersionUID = -3187283988112642076L;

  public NotFoundException(Throwable cause) {
    super(cause);
  }

  public NotFoundException(String msg, Throwable cause) {
    super(msg, cause);
  }

  public NotFoundException(String msg) {
    super(msg);
  }
}
