package com.serviceperimetalguard.sodcore.modelo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "clientes")
public class Cliente {
	
	@Id @GeneratedValue
	private Long id;
	private String nombres;
	private String apellidos;
	private String identificacion;
	
	@Enumerated(EnumType.STRING)
	private TipoCliente tipo;
}