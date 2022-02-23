package com.ivoronline.springboot_security_antmatchers_addauthorities.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
  @RequestMapping("/EndPoint1") public String endPoint1() { return "Hello from EndPoint1"; }
  @RequestMapping("/EndPoint2") public String endPoint2() { return "Hello from EndPoint2"; }
  @RequestMapping("/EndPoint3") public String endPoint3() { return "Hello from EndPoint3"; }
  @RequestMapping("/EndPoint4") public String endPoint4() { return "Hello from EndPoint4"; }
  @RequestMapping("/EndPoint5") public String endPoint5() { return "Hello from EndPoint5"; }
}
