package com.todolist.Todo.Llist.repository;

import com.todolist.Todo.Llist.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa,Long> {

}
