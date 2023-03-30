package com.example.springdoctest.paramobject;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springdoc.api.annotations.ParameterObject;
import org.springdoc.core.SpringDocConfigProperties;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://github.com/springdoc/springdoc-openapi/issues/2181
 * 再現しない
 *
 * 参考:
 * https://github.com/Charles7c/continew-admin/blob/47fa1422bb32e5f7d2fb925d201e089a157260cb/continew-admin-webapi/src/main/java/top/charles7c/cnadmin/webapi/controller/monitor/LogController.java
 * https://github.com/Charles7c/continew-admin/blob/405c821e2a811d142543267e3da48900eda2ff44/continew-admin-monitor/src/main/java/top/charles7c/cnadmin/monitor/model/query/LoginLogQuery.java
 * https://github.com/Charles7c/continew-admin/blob/405c821e2a811d142543267e3da48900eda2ff44/continew-admin-common/src/main/java/top/charles7c/cnadmin/common/model/query/PageQuery.java
 */
@RestController
@RequestMapping("param/object")
public class ParameterObjectController {
  @GetMapping("annotated")
  public String annotated(@Validated @ParameterObject Request request, @Validated @ParameterObject PageQuery pageQuery) {
    System.out.println(request);
    System.out.println(pageQuery.getPage());
    return null;
  }

  @GetMapping("nothing")
  public String nothing(@Validated Request request, @Validated PageQuery pageQuery) {
    System.out.println(request);
    System.out.println(pageQuery.getPage());
    return null;
  }

  @GetMapping("oneNothing")
  public String oneNothing(@Validated Request request) {
    System.out.println(request);
    return null;
  }

  @Schema(description = "リクエスト")
  record Request(
      @Schema(description = "the id")
      @Query
      String id,
      @Schema(description = "the name")
      @Query
      String name) {}


  @Schema(description = "ページ")
  class PageQuery extends SortQuery {
      @Schema(description = "ページ")
      private int page;
      @Schema(description = "サイズ")
      private int size;

    public PageQuery(int page, int size) {
      this.page = page;
      this.size = size;
    }

    public int getPage() {
      return page;
    }

    public int getSize() {
      return size;
    }
  }

  public class SortQuery {
    @Schema(description = "ソート")
    private String[] sort;

    public String[] getSort() {
      return sort;
    }
  }
}
