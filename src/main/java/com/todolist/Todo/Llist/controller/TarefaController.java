package com.todolist.Todo.Llist.controller;

import com.todolist.Todo.Llist.model.Tarefa;
import com.todolist.Todo.Llist.service.TarefaService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarefas")
public class TarefaController {

    private final TarefaService service;

    public TarefaController(TarefaService service) {
        this.service = service;
    }


    @GetMapping
   public List<Tarefa> listar(){
     return service.listarTodos();
    }
    @GetMapping("/{id}")
     public Tarefa buscarPorId(@PathVariable Long id){
        return service.listarPorId(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Tarefa criar(@RequestBody @Valid Tarefa t){
        return service.criar(t);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)

    public void deletar(@PathVariable Long id){service.deletar(id);}
}
