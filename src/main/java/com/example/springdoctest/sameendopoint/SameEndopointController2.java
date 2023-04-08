package com.example.springdoctest.sameendopoint;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * https://stackoverflow.com/questions/75891698/swagger-3-open-api-doesnt-display-api-details-with-same-endpoint-but-with-diffe
 */
@RestController
@RequestMapping("same/endpoint2")
public class SameEndopointController2 {
  /*
  @Parameters({
      @Parameter(in = ParameterIn.QUERY,
          schema = @Schema(oneOf = { ARequestClass.class, BRequestClass.class, CRequestClass.class }))
  })
   */
  @RequestMapping(value = "/title/find", params = {"provider", "offerEnd"}, method = RequestMethod.GET)
  public List<Title> AMethodName(ARequestClass requestClass) {
    System.out.println("AMethodName:" + requestClass.provider + "," + requestClass.offerEnd);
    return null;
  }

  // @Hidden
  @RequestMapping(value = "/title/find", params = {"channel", "offerStart"}, method = RequestMethod.GET)
  public List<Title> BMethodName(BRequestClass requestClass) {
    System.out.println("BMethodName:" + requestClass.channel + "," + requestClass.offerStart);
    return null;
  }

  // @Hidden
  @RequestMapping(value = "/title/find", params = {"provider", "offerStart", "titleBrief"}, method = RequestMethod.GET)
  public List<Title> CMethodName(CRequestClass requestClass) {
    System.out.println("CMethodName:" + requestClass.provider + "," + requestClass.offerStart + ", " + requestClass.titleBrief);
    return null;
  }

  record Title(String id) {}

  record ARequestClass(@Schema(required = true) String provider, @Schema(required = true) String offerEnd) {}
  record BRequestClass(@Schema(required = true) String channel, @Schema(required = true) List<String> offerStart) {}
  record CRequestClass(@Schema(required = true) List<String> provider, @Schema(required = true) List<String> offerStart, @Schema(required = true) String titleBrief) {}
}
