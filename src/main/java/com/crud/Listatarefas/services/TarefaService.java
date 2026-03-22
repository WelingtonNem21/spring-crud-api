package com.crud.Listatarefas.services;

import com.crud.Listatarefas.Entidade.TarefaEntidade;
import com.crud.Listatarefas.Repositorio.TarefaRepository;

public class TarefaService {
    
    private TarefaRepository repository; 
    public TarefaEntidade inserir(TarefaEntidade tarefa){
       
      return  repository.save(tarefa);
        
    }
}
