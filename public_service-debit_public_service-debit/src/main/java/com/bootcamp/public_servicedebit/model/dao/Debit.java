package com.bootcamp.public_servicedebit.model.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(value = "debit") //ADDED
public class Debit {

	@Id
    private String id;
	private String numeroCuenta;
	private String numeroCuentaInter;
	private Double monto;
	private String tipoMoneda;
	private Boolean mantenimiento;
	private Integer movimientoMensuales;
	
}
