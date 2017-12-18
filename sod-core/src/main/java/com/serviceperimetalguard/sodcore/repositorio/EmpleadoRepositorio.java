package com.serviceperimetalguard.sodcore.repositorio;

import com.serviceperimetalguard.sodcore.modelo.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "empleados", path = "empleados")
public interface EmpleadoRepositorio extends CrudRepository<Empleado, Long> {
}