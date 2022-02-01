package evrentan.restaurantmanagement.apigateway;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Objects;

@SpringBootTest(classes = {ApiGatewayApplication.class})
class ApiGatewayApplicationTests {

	@Mock
	private ApplicationContext applicationContext;

	@Test
	@DisplayName("Context Load Testing")
	void contextLoads() {
		Mockito.when(Objects.nonNull(this.applicationContext.getBean(ApiGatewayApplication.class))).thenReturn(true);
		Assertions.assertTrue(Objects.nonNull(this.applicationContext.getBean(ApiGatewayApplication.class)));
	}

}
