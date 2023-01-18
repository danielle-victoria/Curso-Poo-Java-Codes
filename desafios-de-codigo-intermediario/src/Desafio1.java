/*Você e seus amigos estão em uma aula de criação de
 jogos. Para inspirar os alunos e treinar, o professor
  pediu para que vocês fizessem um jogo que já existe 
  com alguma modificação. A escolha de vocês foi "Pedra,
   Papel e Tesoura" e a modificação foi mudar Pedra para
    Flecha, Papel para Escudo e Tesoura para Espada.

Então, vocês escolheram um número para representar cada um dos parâmetros. Sendo:

1 - Flecha
2 - Escudo
3 - Espada */
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int jogadaJogador = leitor.nextInt();
        int jogadaInimigo = leitor.nextInt();

        int resultado = jogadaJogador - jogadaInimigo;

        if(resultado == 0){
            System.out.println("Empatou");
        
        }else if(resultado == -1 || resultado == 2){
            System.out.println("Perdeu");
        }else{
            System.out.println("Ganhou");
        }
    }
}
