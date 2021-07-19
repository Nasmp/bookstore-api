package com.mark1.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mark1.bookstore.domain.Categoria;
import com.mark1.bookstore.repositories.CategoriaRepository;
import com.mark1.bookstore.service.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;

	public Categoria findById(Integer id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Item não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));

	}
	
	public List<Categoria> findAll(){
		return repository.findAll();
	}

}