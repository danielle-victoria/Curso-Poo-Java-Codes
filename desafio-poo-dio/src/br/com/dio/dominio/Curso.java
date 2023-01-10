package br.com.dio.dominio;

public class Curso extends Conteudo{

    
    private int cargaHoraria;

    //Construtor - Opcional
    public Curso(){

    }
   
    public double calcularXP(){
        return XP_PADRAO * cargaHoraria;
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
        "titulo='" + getTitulo() + '\'' +
        ", descricao'" + getDescricao() + '\'' + 
        ", cargaHoraria=" + cargaHoraria +
        '}';
    }
    
}
