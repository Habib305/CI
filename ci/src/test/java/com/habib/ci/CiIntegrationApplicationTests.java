package com.habib.ci;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class CiIntegrationApplicationTests {

	@Test
	void contextLoads() {
	}

}
