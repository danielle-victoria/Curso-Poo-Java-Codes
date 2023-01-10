package br.com.dio.dominio;

public class Curso {

    private String titulo;
    private String descricao;
    private int cargaHoraria;

    //Construtor - Opcional
    Curso(){

    }
    public String getTitulo(){
        return titulo;        
    }

    public void setTitutlo(String titulo){
        this.titulo = titulo;
    }

    public String getDescricao(){
        return descricao;        
    }

    public void set(String descricao){
        this.descricao = descricao;
    }

    public int getCargaHoraria(){
        return cargaHoraria;        
    }

    public void set(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString(){
        return "Curso{" +
        "titulo='" + titulo + '\'' +
        ", descricao'" + descricao + '\'' + 
        ", cargaHoraria=" + cargaHoraria +
        '}';
    }
    
}
