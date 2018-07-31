package com.marcos.cursomv.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.cursomv.domain.Cliente;
import com.marcos.cursomv.repositories.ClienteRepository;
import com.marcos.cursomv.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado: Id " + id + ", Tipo " + Cliente.class.getName()));
	}

}
