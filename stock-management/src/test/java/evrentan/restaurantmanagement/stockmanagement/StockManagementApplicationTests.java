package evrentan.restaurantmanagement.stockmanagement;

import evrentan.restaurantmanagement.stockmanagement.spring.spring.StockManagementApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Objects;

@SpringBootTest(classes = {StockManagementApplication.class})
class StockManagementApplicationTests {

  @Mock
  private ApplicationContext applicationContext;

  @Test
  @DisplayName("Context Load Testing")
  void contextLoads() {
    Mockito.when(Objects.nonNull(this.applicationContext.getBean(StockManagementApplicationTests.class))).thenReturn(true);
    Assertions.assertTrue(Objects.nonNull(this.applicationContext.getBean(StockManagementApplicationTests.class)));
  }

}
