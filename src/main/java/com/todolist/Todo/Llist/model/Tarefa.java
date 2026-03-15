package com.todolist.Todo.Llist.model;

import ch.qos.logback.core.status.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private Status status = Status.PENDENTE;

    private LocalDateTime criadoEm = LocalDateTime.now();

    public enum  Status{PENDENTE, EM_ANDAMENTO, CONCLUIDA}

}
