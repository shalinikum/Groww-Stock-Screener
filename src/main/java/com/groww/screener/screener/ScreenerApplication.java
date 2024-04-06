package com.groww.screener.screener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ScreenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScreenerApplication.class, args);
	}

}
