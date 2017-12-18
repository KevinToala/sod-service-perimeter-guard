package com.serviceperimetalguard.sodcore.Controller;

import com.serviceperimetalguard.sodcore.modelo.Cliente;
import com.serviceperimetalguard.sodcore.repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
public class ClienteController {
	@Autowired
	private ClienteRepositorio clienteRepositorio;
	
	@GetMapping("/clientes")
	public ResponseEntity<Collection<Cliente>> obtenerClientes(){
		Set<Cliente> clientes = StreamSupport
				.stream(clienteRepositorio.findAll().spliterator(), true)
				.collect(Collectors.toSet());
		return ResponseEntity.ok(clientes);
	}
}