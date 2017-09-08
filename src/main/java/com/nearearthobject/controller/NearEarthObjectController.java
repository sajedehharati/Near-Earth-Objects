package com.nearearthobject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.nearearthobject.Quote;
import com.nearearthobject.Service.NearObjectEarthService;
import com.nearearthobject.dto.Statistics;
import com.nearearthobject.view.NearObjectView;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = { "/v1/neo" }, produces = MediaType.APPLICATION_JSON_VALUE)
public class NearEarthObjectController {

  @Autowired
  private NearObjectEarthService nearObjectEarthService;

  @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
  @ApiOperation(value = "Returns near object earth", response = Quote.class)
  @JsonView(NearObjectView.class)
  public ResponseEntity<Statistics> getNearObjectEarth() {
    Statistics statistics = nearObjectEarthService.run();
    return new ResponseEntity<>(statistics, HttpStatus.OK);
  }
}
