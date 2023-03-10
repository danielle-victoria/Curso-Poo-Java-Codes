package br.com.dio.dominio;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.set("Descriçao Curso Java");
        curso1.set(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.set("Descriçao Curso JS");
        curso2.set(4);

        Conteudo conteudo1= new Mentoria();
        Conteudo conteudo2 = new Curso();
        
        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.set("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        Dev devDanielle = new Dev();
        devDanielle.setNome("Danielle");
        devDanielle.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Inscritos Danielle: " + devDanielle.getconteudosInscritos());
        devDanielle.progredir();
        devDanielle.progredir();
        System.out.println("\nConteúdos Inscritos Danielle: " + devDanielle.getconteudosInscritos());
        System.out.println("\nConteúdos Concluídos Danielle: " + devDanielle.getconteudosConcluidos());
        System.out.println("\nXP: " + devDanielle.calcularXP());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Inscritos João: " + devJoao.getconteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("\nConteúdos Inscritos João: " + devJoao.getconteudosInscritos());
        System.out.println("\nConteúdos Concluídos João: " + devJoao.getconteudosConcluidos());
        System.out.println("\nXP: " + devJoao.calcularXP());






        

    }
}