package spring.boot_docker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;


@Controller
public class HelloController {
  
  @GetMapping("/hello")
  public String getMethodName(Model model){
    return "index";
  }
  
}

