package com.spring.todo.services;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.todo.repositories.TodoRepository;
import com.spring.todo.todo.domain.Todo;

@Service
public class DBService {
	

	
	@Autowired
	private TodoRepository todoRepository;
	
	public void instanciaBaseDeDados() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Angular 11", sdf.parse("27/06/2023"), false);
		Todo t2 = new Todo(null, "Ler", "Ler livro de desenvolvimento pessoal", sdf.parse("22/06/2022"), true);
		Todo t3 = new Todo(null, "Exercicios", "Praticar exercicios fisicos", sdf.parse("19/06/2023"),false);
		
		Todo t4 = new Todo(null, "Meditar", "Meditar durantte 30 minutos pela manhã", sdf.parse("27/03/2023"),true);
		
			todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}
	}
	

