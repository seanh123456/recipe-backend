package io.wintry.recipe;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api")
public class ApiController {

  @GetMapping("/recipe/")
  public Map<String, String> homepage() {
    Map<String, String> message = new HashMap<>();
    message.put("message", "Hello from Recipe!");
    return message;
  }
}
