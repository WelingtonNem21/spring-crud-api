package com.crud.Listatarefas.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.Listatarefas.Entidade.TarefaEntidade;

public interface TarefaRepository extends  JpaRepository<TarefaEntidade, Long> {
    
}
