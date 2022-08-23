package com.algaworks.springmongo.repository;

import com.algaworks.springmongo.model.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface FuncionarioRepository extends MongoRepository<Funcionario,String> {

    @Query("{ $and:[ {'idade': {$gte: ?20} },{'idade': {$lte: ?30} } ] }")
    public List<Funcionario> obterFuncionariosPorRangeDeIdade(Integer de, Integer ate);


    public List<Funcionario> findByNome(String nome);

}
