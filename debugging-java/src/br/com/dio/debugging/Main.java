package br.com.dio.debugging;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciou do programa no método main.");
        a();
        System.out.println("Finalizou do programa no método main.");
    }

    public static void a() {
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Finalizou o método a.");
    }

    public static void b() {
        System.out.println("Entrou no método b.");
        for(int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o método b.");
    }

    public static void c(){
        System.out.println("Entrou no método c.");
        Thread.dumpStack(); //Usado para fazer depuração do código
        System.out.println("Finalizou o método c.");
    }

    
}
