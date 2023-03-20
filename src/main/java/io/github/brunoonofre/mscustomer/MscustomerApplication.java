package io.github.brunoonofre.mscustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
@EnableJpaRepositories(basePackages = "io.github.brunoonofre.mscustomer.infra.repository")
public class MscustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MscustomerApplication.class, args);
	}

}
