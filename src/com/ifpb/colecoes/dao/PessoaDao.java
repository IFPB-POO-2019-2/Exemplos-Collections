package com.ifpb.colecoes.dao;

import com.ifpb.colecoes.modelo.Pessoa;

import java.util.HashSet;
import java.util.Set;

public class PessoaDao {

    private Set<Pessoa> pessoas;

    public PessoaDao(){
        pessoas = new HashSet<>();
    }

    public boolean salvar(Pessoa pessoa){
        return pessoas.add(pessoa);
    }

    public Set<Pessoa> listar(){
        return pessoas;
    }

    public boolean remover(Pessoa pessoa){
        return pessoas.remove(pessoa);
    }

    public boolean atualizar(Pessoa pessoa){
        Pessoa aux = new Pessoa(pessoa.getCpf());

        if(pessoas.contains(aux)){
            return pessoas.remove(aux) && pessoas.add(pessoa);
        }else{
            return false;
        }
    }

}