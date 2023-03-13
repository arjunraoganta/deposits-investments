package com.arjun.deposits.investments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DepositsInvestmentsApplication {
  public static void main(String[] args) {
	SpringApplication.run(DepositsInvestmentsApplication.class, args);
}
}
