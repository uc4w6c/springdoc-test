package com.example.springdoctest.datetimeformatter;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public class DateTimeFormatterResponse {
  @DateTimeFormat(pattern = "HH:mm")
  @JsonFormat(pattern = "HH:mm")
  private LocalDateTime time;

  private String id;

  public DateTimeFormatterResponse(LocalDateTime time, String id) {
    this.time = time;
    this.id = id;
  }

  public LocalDateTime getTime() {
    return time;
  }

  public String getId() {
    return id;
  }
}
