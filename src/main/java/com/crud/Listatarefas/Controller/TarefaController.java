package com.crud.Listatarefas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Listatarefas.Entidade.TarefaEntidade;
import com.crud.Listatarefas.Repositorio.TarefaRepository;
import com.crud.Listatarefas.services.TarefaService;




@RestController
@RequestMapping("/tarefa")
public class TarefaController {

    @Autowired
    private TarefaRepository repository;
    private TarefaService service;

    @PostMapping
    public TarefaEntidade criar(@RequestBody TarefaEntidade tarefa) {
        
        if(tarefa.getTarefa() == ""){
           throw new  RuntimeException("Preencher ");
        }

        TarefaEntidade tarefas = service.inserir(tarefa);

        return tarefas;
    }


    @GetMapping()
    public List<TarefaEntidade> filters(@RequestParam String name){

        List<TarefaEntidade> tarefa = repository.findAll();

        return tarefa.stream().filter(n -> n.equals(tarefa)).toList();
        
    }

    @GetMapping
    public List<TarefaEntidade> hi() {

        List<TarefaEntidade> tarefas = repository.findAll();

        return tarefas;
    }

    @DeleteMapping("/{id}")
    public  void delete(@PathVariable Long id){

        repository.deleteById(id);
    }


    @PutMapping("/{id}")
    public TarefaEntidade atulizar(@PathVariable Long id, @RequestBody TarefaEntidade novaTarefa){

        TarefaEntidade tarefa = repository.findById(id).orElseThrow(() -> new RuntimeException("teste"));


        tarefa.setTarefa(novaTarefa.getTarefa());

        
        return repository.save(tarefa);
    }

}
