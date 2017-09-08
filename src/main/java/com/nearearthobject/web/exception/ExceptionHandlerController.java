package com.nearearthobject.web.exception;

import java.net.ConnectException;
import java.net.SocketTimeoutException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlerController {
  private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionHandlerController.class);

  @ResponseStatus(HttpStatus.REQUEST_TIMEOUT)
  @ExceptionHandler(SocketTimeoutException.class)
  @ResponseBody
  public ErrorInfo handlesSocketTimeOutException(final HttpServletRequest req, final Exception ex) {
    LOGGER.error("Socket Timeout Exception", ex.getMessage());
    return new ErrorInfo(req.getRequestURL().toString(), ex);
  }

  @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
  @ExceptionHandler(ConnectException.class)
  @ResponseBody
  public ErrorInfo connectionException(final HttpServletRequest req, final Exception ex) {
    LOGGER.error("Service Unavailable", ex.getMessage());
    return new ErrorInfo(req.getRequestURL().toString(), ex);
  }

  @ResponseStatus(HttpStatus.FORBIDDEN)
  @ExceptionHandler(Forbiddenexception.class)
  @ResponseBody
  public ErrorInfo forbiddenException(final HttpServletRequest req, final Exception ex) {
    LOGGER.error("Service forbidden", ex.getMessage());
    return new ErrorInfo(req.getRequestURL().toString(), ex);
  }

  @ResponseStatus(HttpStatus.NOT_FOUND)
  @ExceptionHandler(NotFoundException.class)
  @ResponseBody
  public ErrorInfo notFoundException(final HttpServletRequest req, final Exception ex) {
    LOGGER.error("Service not found", ex.getMessage());
    return new ErrorInfo(req.getRequestURL().toString(), ex);
  }

}
