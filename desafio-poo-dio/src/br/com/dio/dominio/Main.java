package br.com.dio.dominio;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitutlo("Curso Java");
        curso1.set("Descriçao Curso Java");
        curso1.set(8);
        
        Curso curso2 = new Curso();
        curso2.setTitutlo("Curso JS");
        curso2.set("Descriçao Curso JS");
        curso2.set(4);
        
        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.set("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);


        

    }
}