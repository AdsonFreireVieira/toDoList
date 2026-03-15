package com.todolist.Todo.Llist.service;

import com.todolist.Todo.Llist.model.Tarefa;
import com.todolist.Todo.Llist.repository.TarefaRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class TarefaService {

    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public List<Tarefa> listarTodos() {
        return repository.findAll();
    }

    public Tarefa listarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada com id: " + id));
    }

    public Tarefa criar(Tarefa t) {
        return repository.save(t);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}