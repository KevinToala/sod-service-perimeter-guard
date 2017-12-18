package com.serviceperimetalguard.sodcore.repositorio;

import com.serviceperimetalguard.sodcore.modelo.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface ClienteRepositorio extends CrudRepository<Cliente, Long> {
}