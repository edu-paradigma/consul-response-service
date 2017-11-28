package es.paradigmadigital.consulresponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulResponseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsulResponseApplication.class, args);
	}
	
}
