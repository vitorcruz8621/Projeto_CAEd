package com.caed.projeto.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caed.projeto.model.Projeto;
import com.caed.projeto.service.ProjetoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projetos")
public class ProjetoController {
	
	public final ProjetoService projetoService;
	
	@GetMapping
	public ResponseEntity<List<Projeto>> retornarTodosProjetos() {
        List<Projeto> projetosRetornados = projetoService.retornarTodosProjetos();
        return ResponseEntity.ok(projetosRetornados);
    }

}
