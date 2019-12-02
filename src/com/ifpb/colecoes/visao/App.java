package com.ifpb.colecoes.visao;

import com.ifpb.colecoes.modelo.Pessoa;

import java.time.LocalDate;
import java.util.*;

public class App {

    public static void main(String[] args) {

//        operacoesListas();
//        operacoesPilhas();

//        System.out.println(ehBalanceada("(X+Y*(A+B)+C)"));
//        System.out.println(ehBalanceada("(A+B+C))"));
//        System.out.println(ehBalanceada("(B+C+(A+B)"));

//        operacoesConjuntos();
        operacoesConjuntosOrdenados();

    }

    private static void operacoesConjuntosOrdenados() {

        //Serão ordenados pelo Comparable em ordem crescente.
        Set<Pessoa> pessoas = new TreeSet<>();

        pessoas.add(new Pessoa("222.222.222-02", "João",
                LocalDate.now()));
        pessoas.add(new Pessoa("111.111.111-01", "Maria",
                LocalDate.now()));
        pessoas.add(new Pessoa("111.111.111-01", "Ana",
                LocalDate.now()));

        System.out.println(pessoas);

    }

    private static void operacoesConjuntos() {
        Set<Pessoa> pessoas = new HashSet<>();

        //Adicionar
        pessoas.add(new Pessoa("111.111.111-01", "João",
                LocalDate.now()));
        pessoas.add(new Pessoa("222.222.222-02", "Maria",
                LocalDate.now()));
        if(pessoas.add(new Pessoa("111.111.111-01", "Ana",
                LocalDate.now()))){
            System.out.println("Inserido");
        }else{
            System.out.println("Não inserido");
        }

        //Verificar se está presente
        System.out.println(pessoas.contains(new Pessoa("111.111.111-01",
                "João", LocalDate.now())));

        //Remover
        pessoas.remove(new Pessoa("111.111.111-01", "aaa", LocalDate.now()));

        System.out.println(pessoas);

    }

    public static boolean ehBalanceada(String equacao){
        Stack<String> pilha = new Stack<>();

        for(int i=0; i<equacao.length();i++){
            if(equacao.charAt(i) == '('){
                //Pode ser qualquer coisa...
                pilha.push("AAA");
            }else if(equacao.charAt(i) == ')'){
                if(pilha.isEmpty()) return false;
                pilha.pop();
            }
        }
        return pilha.isEmpty();
    }

    private static void operacoesPilhas() {

        //Inicializar como pilha e não como lista para acessar os métodos específicos
        Stack<String> palavras = new Stack<>();

        palavras.push("João");
        palavras.push("Maria");
        palavras.push("Pedro");
        palavras.push("Ana");

        //Não usar assim, pois irá imprimir como uma lista
//        System.out.println(palavras);
        //Não usar assim, pois irá imprimir como uma lista
//        for(String s : palavras){
//            System.out.println(s);
//        }

        //Consultar o topo
        System.out.println("Topo: "+palavras.peek());

        //Consultar a posição de um elemento (ao topo)
        System.out.println("Posição de Ana: "+palavras.search("Ana"));

        //Percorrer como pilha - do topo à base
        while (!palavras.isEmpty()){
            System.out.println(palavras.pop());
        }

    }

    private static void operacoesListas() {
        List<Pessoa> pessoas = new ArrayList<>();

        //CREATE
        pessoas.add(new Pessoa("111.111.111-01", "João",
                LocalDate.of(1990,1,3)));
        //Consegue add de 0 até size()
        pessoas.add(1, new Pessoa("222.222.222-02", "Maria",
                LocalDate.of(1992,5,1)));

        //READ
        //Listagem
//        System.out.println(pessoas);
        //Recuperar por posição - 0 até size()-1
//        System.out.println(pessoas.get(2));
        //Listagem com for
//        for(int i=0; i<pessoas.size(); i++){
//            System.out.println(pessoas.get(i));
//        }
        //Listagem com for aprimorado
//        for(Pessoa p : pessoas){
//            System.out.println(p);
//        }
        //Verificar a posição de um elemento (equals)
//        System.out.println(pessoas.indexOf(new Pessoa("111.111.111-01",
//                "João", LocalDate.of(1990,1,3))));

        //DELETE
        //Remover pelo índice
//        pessoas.remove(0);
        //Remover pelo objeto (equals)
//        pessoas.remove(new Pessoa("111.111.111-01", "João",
//                LocalDate.of(1990,1,3)));

        //UPDATE
        //Substituir
//        pessoas.set(0, new Pessoa("333.333.333-03",
//                "Pedro", LocalDate.now()));
        //Alterar objeto pela referência
//        pessoas.get(0).setNome("João Pedro");

        System.out.println(pessoas);
    }

}
