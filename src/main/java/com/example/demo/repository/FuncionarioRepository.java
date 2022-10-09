package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.model.Funcionario;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String>{
    
    @Query("{ $and: [ { 'idade': {$gte: ?0 } }, { 'idade' : {$lte: ?1 } } ] }")
    public List<Funcionario> obterFuncionariosPorRangeDeIdade(Integer de, Integer ate);
   
    public List<Funcionario> findByNome(String nome); 

}