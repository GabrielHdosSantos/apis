package com.br.integracao.apis.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    private LocalDate dataContratacao;

    public Funcionario(String nome, String cpf, LocalDate dataContratacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataContratacao = dataContratacao;
    }

    @Deprecated
    public Funcionario(){}
}
