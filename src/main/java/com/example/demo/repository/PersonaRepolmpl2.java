package com.example.demo.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.example.demo.DemoConsolaApplication;

@Repository
@Qualifier("Persona2")
public class PersonaRepolmpl2 implements IPersonaRepo{
	
	private static Logger LOG = LoggerFactory.getLogger(DemoConsolaApplication.class);

	@Override
	public void registrar(String nombre) {
		LOG.info("No se registro a " + nombre);
		
	}

}
