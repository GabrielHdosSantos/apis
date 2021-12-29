package com.br.integracao.apis.service;

import com.br.integracao.apis.modelo.Funcionario;
import com.br.integracao.apis.repos.FuncionarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class FuncionarioService {

    @Autowired
    private FuncionarioRepo repo;

    public Funcionario adicionarFuncionario(Funcionario funcionario){
        return repo.save(funcionario);
    }

    public Funcionario updateFuncionario(Funcionario funcionario){
        return repo.save(funcionario);
    }

    public Funcionario acharPeloId(Long id){
        return repo.getById(id);
    }

    public List<Funcionario> acharTodos(){
        return repo.findAll();
    }

    public void deletarFuncionario(Long id){
        repo.deleteById(id);
    }


}
