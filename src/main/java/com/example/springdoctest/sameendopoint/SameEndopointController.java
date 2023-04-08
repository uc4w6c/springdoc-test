package com.example.springdoctest.sameendopoint;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("same/endpoint")
public class SameEndopointController {
  /*@Operation(parameters = @Parameters(@Parameter(in = ParameterIn.QUERY,
      schema = @Schema(oneOf = )
  )))*/
  @RequestMapping(value = "/title/find", params = {"provider", "offerEnd"}, method = RequestMethod.GET)
  public List<Title> AMethodName(
      @RequestParam final String provider,
      @RequestParam final String offerEnd) {
    System.out.println("AMethodName:" + provider + "," + offerEnd);
    return null;
  }

  @RequestMapping(value = "/title/find", params = {"channel", "offerStart"}, method = RequestMethod.GET)
  public List<Title> BMethodName(
      @RequestParam final String channel,
      @RequestParam final List<String> offerStart) {
    System.out.println("BMethodName:" + channel + "," + offerStart);
    return null;
  }

  @RequestMapping(value = "/title/find", params = {"provider", "offerStart", "titleBrief"}, method = RequestMethod.GET)
  public List<Title> CMethodName(
      @RequestParam final List<String> provider,
      @RequestParam final List<String> offerStart,
      @RequestParam final String titleBrief) {
    System.out.println("CMethodName:" + provider + "," + offerStart + ", " + titleBrief);
    return null;
  }

  record Title(String id) {}
}
