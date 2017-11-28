package es.paradigmadigital.consulresponse.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/consul-response")
public class ConsulResponseController {

	@Value("${key_1}")
	private String key1;

	@Value("${key_2}")
	private String key2;

	@Value("${key_3}")
	private String key3;

	@GetMapping()
	public ResponseEntity<ResponseDTO> getResponse() {
		ResponseEntity<ResponseDTO> response = new ResponseEntity<ResponseDTO>(
				new ResponseDTO("Response from consul-response-service"), HttpStatus.OK);
		return response;
	}

	@GetMapping(path = "/config")
	public ResponseEntity<String> getConfig(String name) {
		ResponseEntity<String> response = new ResponseEntity<String>(key1 + " " + key2 + " " + key3, HttpStatus.OK);
		return response;
	}
}
