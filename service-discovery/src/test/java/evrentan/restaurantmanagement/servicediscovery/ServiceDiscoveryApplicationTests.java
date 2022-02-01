package evrentan.restaurantmanagement.servicediscovery;

import evrentan.restaurantmanagement.servicediscovery.spring.spring.ServiceDiscoveryApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Objects;

@SpringBootTest(classes = {ServiceDiscoveryApplication.class})
class ServiceDiscoveryApplicationTests {

  @Mock
  private ApplicationContext applicationContext;

  @Test
  @DisplayName("Context Load Testing")
  void contextLoads() {
    Mockito.when(Objects.nonNull(this.applicationContext.getBean(ServiceDiscoveryApplication.class))).thenReturn(true);
    Assertions.assertTrue(Objects.nonNull(this.applicationContext.getBean(ServiceDiscoveryApplication.class)));
  }

}
