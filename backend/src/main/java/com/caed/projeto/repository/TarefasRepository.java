package com.caed.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caed.projeto.model.Tarefas;

public interface TarefasRepository extends JpaRepository<Tarefas, Long> {

}
