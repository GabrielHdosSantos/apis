package com.br.integracao.apis.resources;

import com.br.integracao.apis.modelo.Funcionario;
import com.br.integracao.apis.service.FuncionarioService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioResources {

    @Autowired
    private FuncionarioService service;

    @PostMapping
    public ResponseEntity<Funcionario> adicionarFuncionario(@RequestBody Funcionario funcionario){
        Funcionario newFuncionario = service.adicionarFuncionario(funcionario);
        return new ResponseEntity<>(newFuncionario, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Funcionario> updateFuncionario(@RequestBody Funcionario funcionario){
            Funcionario newFuncionario = service.updateFuncionario(funcionario);
            return new ResponseEntity<>(newFuncionario, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Funcionario> acharPeloId(@PathVariable("id") Long id){
        Funcionario funcionario = service.acharPeloId(id);
        return new ResponseEntity<>(funcionario, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable Long id){
        service.deletarFuncionario(id);
    }

    @GetMapping
    public ResponseEntity<List<Funcionario>> all(){
        List<Funcionario> funcionarios = service.acharTodos();
        return new ResponseEntity<>(funcionarios, HttpStatus.OK);
    }

}
