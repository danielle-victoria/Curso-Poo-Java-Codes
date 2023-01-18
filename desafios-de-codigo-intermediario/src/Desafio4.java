/*O desafio consiste em um número inteiro n, onde será
necessário calcular a diferença entre o produto e a 
soma dos seus digitos. 

• Para encontrar o produto do valor, os dígitos deverão ser
 multiplicados.

• A soma, basta realizar uma adição entre os dígitos.

• A diferença, é necessário substrair o resultado final dos
 dois valores.
 
 A saída deverá retornar o valor final da diferença entre o 
produto e a soma dos digitos.*/

import java.util.Scanner;
import java.util.Arrays;

public class Desafio4 {
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    int numero = scan.nextInt();

    String numeroEmString = String.valueOf(numero);
    String[] split = numeroEmString.split("");

    int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();

    int produto = 1;
    int soma = 0;
    int diferenca = 0;

    for(int numeros : ints){
        produto *= numeros;
        soma += numeros;
    }

    diferenca = produto - soma;
    
    System.out.println(diferenca);

    }
    
}
