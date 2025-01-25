package com.caed.projeto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.caed.projeto.model.Projeto;
import com.caed.projeto.repository.ProjetoRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class ProjetoService {
	
	private final ProjetoRepository projetoRepository;
	
	public List<Projeto> retornarTodosProjetos() {
		return projetoRepository.findAll();
	}

}