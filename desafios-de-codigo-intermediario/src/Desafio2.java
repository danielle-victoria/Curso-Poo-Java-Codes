/*Um número feliz é um número definido pelo seguinte
 processo:

• Começando com qualquer número inteiro positivo,
 substitua o número pela soma dos quadrados de seus dígitos.
• Repita o processo até que o número seja igual a 1 (onde ficará),
 ou faça um loop infinito em um ciclo que não inclua 1.
• Aqueles números para os quais esse processo termina em 1 são felizes.
• Retorna true se n for um número feliz e false se não for.

Escreva um algoritmo para determinar se o número n é feliz. 

A entrada será feita por um número inteiro, correpondente ao valor de
 entrada para verificar se  o número é feliz ou não.
*/


import java.util.*;
public class Desafio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //TODO: Desenvolva um algoritmo que retorne se o número é feliz ou não
        
        //O método split quebra uma String em várias substrings
        String[] string_n = String.valueOf(n).split(""); 

        int resultado_parcial = 0;
        int posicao_atual = 0;

        String resultado_parcial_string = new String();

        do{

            for (int i = 0; i<string_n.length; i++){

                posicao_atual = Integer.parseInt(String.valueOf(string_n[i]));
                resultado_parcial = (posicao_atual * posicao_atual) + resultado_parcial;
                //resultado_parcial += (posicao_atual * posicao_atual);

                resultado_parcial_string = String.valueOf(resultado_parcial);

            }

            if (resultado_parcial == 1){  
                System.out.println(true);  //É uma número feliz
                break;
            } else if (resultado_parcial_string.length() == 1){
                System.out.println(false); //Não é um número feliz, caso o tamanho da String seja 1 --> Exemplo: 2, 3, 4 , ...
                break;
            }
            string_n = String.valueOf(resultado_parcial_string).split("");
            resultado_parcial = 0;

        }while(true);

    }
    
}
