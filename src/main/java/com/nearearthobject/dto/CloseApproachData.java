package com.nearearthobject.dto;

public class CloseApproachData {

  private String close_approach_date;
  private long epoch_date_close_approach;
  private RelatiVevelocity relative_velocity;
  private MissDistance miss_distance;
  private String orbiting_body;

  public CloseApproachData() {

  }

  public String getClose_approach_date() {
    return close_approach_date;
  }

  public void setClose_approach_date(String close_approach_date) {
    this.close_approach_date = close_approach_date;
  }

  public long getEpoch_date_close_approach() {
    return epoch_date_close_approach;
  }

  public void setEpoch_date_close_approach(long epoch_date_close_approach) {
    this.epoch_date_close_approach = epoch_date_close_approach;
  }

  public RelatiVevelocity getRelative_velocity() {
    return relative_velocity;
  }

  public void setRelative_velocity(RelatiVevelocity relative_velocity) {
    this.relative_velocity = relative_velocity;
  }

  public MissDistance getMiss_distance() {
    return miss_distance;
  }

  public void setMiss_distance(MissDistance miss_distance) {
    this.miss_distance = miss_distance;
  }

  public String getOrbiting_body() {
    return orbiting_body;
  }

  public void setOrbiting_body(String orbiting_body) {
    this.orbiting_body = orbiting_body;
  }

}
