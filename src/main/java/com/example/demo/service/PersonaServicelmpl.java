package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IPersonaRepo;
import com.example.demo.repository.PersonaRepolmpl1;
@Service
public class PersonaServicelmpl implements IPersonaService{
	
	@Autowired
	@Qualifier("Persona2")
	private IPersonaRepo repo;
	@Override
	public void registrar(String nombre) {
		repo.registrar(nombre);
		
	}

}
