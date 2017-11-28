package es.paradigmadigital.consulresponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.cloud.endpoint.RefreshEndpoint;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulResponseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsulResponseApplication.class, args);
	}
	
	@Bean
	public RefreshEndpoint hola(){
		return new RefreshEndpoint(new ContextRefresher(null, null));
	}
}
