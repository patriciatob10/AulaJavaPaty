package com.kaspper.tarefasapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.kaspper.tarefasapi.entity.Categorias;
import com.kaspper.tarefasapi.repository.CategoriasRepository;

public class CategoriasController {
	@Autowired
	CategoriasRepository CategoriasRepository;

	
	@PostMapping
	public Categorias inserirCategorias(@RequestBody Categorias novaCategorias) {

		var categorias = CategoriasRepository.save(novaCategorias);

		return categorias;
	}

}