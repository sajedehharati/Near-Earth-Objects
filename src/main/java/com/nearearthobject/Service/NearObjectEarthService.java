package com.nearearthobject.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nearearthobject.NearEarthObjectApplication;
import com.nearearthobject.dto.NearEarthObjectsBrowser;
import com.nearearthobject.dto.Statistics;

@Service
public class NearObjectEarthService {

  private static final Logger log = LoggerFactory.getLogger(NearEarthObjectApplication.class);

  public Statistics run() {
    RestTemplateBuilder builder = new RestTemplateBuilder();
    RestTemplate restTemplate = builder.build();


    NearEarthObjectsBrowser nearEarthObjectsBrowser = restTemplate.getForObject(
          "https://api.nasa.gov/neo/rest/v1/neo/browse?page=0&size=20&api_key=DEMO_KEY", NearEarthObjectsBrowser.class);
    //log.info(statistics.toString());
    return new Statistics();

  }
}
