package com.br.integracao.apis.repos;

import com.br.integracao.apis.modelo.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepo extends JpaRepository<Funcionario, Long> {
}
