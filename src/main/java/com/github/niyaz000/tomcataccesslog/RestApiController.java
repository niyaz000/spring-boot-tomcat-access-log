package com.github.niyaz000.tomcataccesslog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

  @GetMapping(path = "/api/v1/jobs")
  public String get() {
    return "{\"agents\":[{\"id\":2000001,\"contact\":{\"avatar\":{\"thumb_url\":\"https://aws-sample-1.com/a1.png\"}}},{\"id\":2000002,\"contact\":{\"avatar\":{\"thumb_url\":\"https://aws-sample-1.com/a2.png\"}}}],\"meta\":{\"count\":2}}";
  }

}
