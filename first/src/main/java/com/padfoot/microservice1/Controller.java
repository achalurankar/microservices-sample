package com.padfoot.microservice1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/microservice/v1")
public class Controller {
	
	@GetMapping(value = "/string")
	public ResponseEntity<?> getAddress() throws Exception  {
		
		return new ResponseEntity<>("string from microservice 1",HttpStatus.OK);

	}
}
