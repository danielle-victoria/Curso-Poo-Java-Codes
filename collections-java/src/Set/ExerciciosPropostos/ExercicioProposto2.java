/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/ 

package Set.ExerciciosPropostos;
import java.util.*;

public class ExercicioProposto2 {

    public static void main(String[] args) {

        System.out.println("\na) Ordem inserção");

        Set<LinguagemFavorita> linguagensFavoritas = new LinkedHashSet<LinguagemFavorita>(){{
            add(new LinguagemFavorita("C", 1972 , "Code::Blocks"));
            add(new LinguagemFavorita("Python", 1991, "Pycharm"));
            add(new LinguagemFavorita("Java", 1991, "Visual Studio Code"));

        }};

        System.out.println(linguagensFavoritas);

        System.out.println("\nb) Ordem natural(nome)");

        Set<LinguagemFavorita> linguagensFavoritas1 = new TreeSet<>(linguagensFavoritas);
        for(LinguagemFavorita linguagens : linguagensFavoritas1) System.out.println(linguagens.getNome() + " - "
            + linguagens.getAnoDeCriacao() + " - " + linguagens.getIde());

        System.out.println("\nc) IDE");
        Set<LinguagemFavorita> linguagensFavoritas2 = new TreeSet<>(new ComparatorIde());
        linguagensFavoritas2.addAll(linguagensFavoritas);
        for(LinguagemFavorita linguagens : linguagensFavoritas2) System.out.println(linguagens.getNome() + " - "
            + linguagens.getAnoDeCriacao() + " - " + linguagens.getIde());


        System.out.println("\nd) Ano de criação e nome;");
        Set<LinguagemFavorita> linguagensFavoritas3 = new TreeSet<>(new ComparatorAnoCriacaoNome());
        linguagensFavoritas3.addAll(linguagensFavoritas);
        for(LinguagemFavorita linguagens : linguagensFavoritas3) System.out.println(linguagens.getNome() + " - "
            + linguagens.getAnoDeCriacao() + " - " + linguagens.getIde());


        System.out.println("\ne) Nome, ano de criação e IDE;");
        Set<LinguagemFavorita> linguagensFavoritas4 = new TreeSet<>(new ComparatorNomeAnoCriacaoIde());
        linguagensFavoritas4.addAll(linguagensFavoritas);
        for(LinguagemFavorita linguagens : linguagensFavoritas4) System.out.println(linguagens.getNome() + " - "
            + linguagens.getAnoDeCriacao() + " - " + linguagens.getIde());


        System.out.println("\nExiba as linguagens no console, um abaixo da outra");
        for(LinguagemFavorita linguagens : linguagensFavoritas) System.out.println(linguagens.getNome());

        
    }
    
}


class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    public String nome;
    public Integer anoDeCriacao;
    public String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome(){
        return nome;
    }

    public Integer getAnoDeCriacao(){
        return anoDeCriacao;
    }

    public String getIde(){
        return ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.nome);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}


class ComparatorIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2){
        
        int ide =  l1.getIde().compareTo(l2.getIde());
        if(ide != 0) return ide;


        return Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
    
    }
       

}

class ComparatorAnoCriacaoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2){
        int anoDeCriacao = Integer.compare(l1.anoDeCriacao, l2.anoDeCriacao);
        if (anoDeCriacao != 0) return anoDeCriacao;
        return l1.nome.compareToIgnoreCase(l2.nome);
    
    }
       

}

class ComparatorNomeAnoCriacaoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2){
        int nome = l1.getNome().compareTo(l2.getNome());
        if(nome !=0) return nome;

        int anoDeCriacao = Integer.compare(l1.anoDeCriacao, l2.anoDeCriacao);
        if (anoDeCriacao != 0) return anoDeCriacao;
        return l1.ide.compareToIgnoreCase(l2.ide);
    
    }

}