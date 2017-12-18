package com.serviceperimeterguard.intermediary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestOperations;

@RestController
public class ClientesController {
	@Autowired
	private RestOperations restOperations;
	
	@GetMapping("/clientes")
	public ResponseEntity<String> obtenerClientes(){
		return restOperations.getForEntity("http://localhost:8081/clientes", String.class);
	}
}