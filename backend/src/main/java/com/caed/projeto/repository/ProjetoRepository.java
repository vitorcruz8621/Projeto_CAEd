package com.caed.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caed.projeto.model.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

}
