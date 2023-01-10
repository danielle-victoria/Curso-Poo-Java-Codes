package br.com.dio.dominio;

import java.time.*;
import java.util.*;


public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<Dev>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao(){
        return descricao;        
    }

    public void set(String descricao){
        this.descricao = descricao ;
    }

    public Set<Dev> getDevsInscritos(){
        return devsInscritos;
    }

    public void setDevsInscritoss(Set<Dev> devsInscritos){
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos(){
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos){
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }

    
}
