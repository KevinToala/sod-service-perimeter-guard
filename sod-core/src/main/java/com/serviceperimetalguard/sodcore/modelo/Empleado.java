package com.serviceperimetalguard.sodcore.modelo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "empleados")
public class Empleado {
	@Id @GeneratedValue
	private Long id;
	private String nombres;
	private String apellidos;
	private String cargo;
}