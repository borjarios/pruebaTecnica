package com.zara.zara;

import com.zara.zara.api.prices.application.PricesService;
import com.zara.zara.api.prices.infrastructure.PricesController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ZaraApplicationTests {

	@Autowired
	private PricesController pricesController;

	@Autowired
	private PricesService pricesService;

	@Test
	void contextLoads() {
		assertThat(pricesController).isNotNull();
		assertThat(pricesService).isNotNull();
	}

}
