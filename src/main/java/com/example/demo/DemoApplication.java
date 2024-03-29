package com.example.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class DemoApplication {

  private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
    logger.info("Demo started! Goto http://localhost:8081/dic_student_name");
  }

  @RestController
  public static class Demo {

    @Value("${fullname:Fedior}")
    private String fullname;

    @GetMapping("/dic_student_name")
    public String getFullName() {
      return "Work done by " + this.fullname+ "!!!!";
    }
  }
}
