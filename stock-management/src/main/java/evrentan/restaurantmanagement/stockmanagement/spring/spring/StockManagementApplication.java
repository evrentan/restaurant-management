package evrentan.restaurantmanagement.stockmanagement.spring.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StockManagementApplication {

  public static void main(String[] args) {
    SpringApplication.run(StockManagementApplication.class, args);
  }

}
