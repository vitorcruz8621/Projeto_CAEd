package com.caed.projeto.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "tarefas", schema = "caed")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tarefas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tarefa")
    private Long id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "data_inicio", nullable = false)
    private LocalDate dataInicio;

    @Column(name = "prioridade", nullable = false)
    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;

    @ManyToOne
    @JoinColumn(name = "campo_fk_id_projeto", nullable = false, referencedColumnName = "id_projeto", foreignKey = @ForeignKey(name = "fk_tarefa_projeto"))
    private Projeto projeto;

    public enum Prioridade {
        MUITO_ALTA, ALTA, BAIXA, MUITO_BAIXA
    }
}
