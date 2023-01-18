/*Cada pizza é composta por 4 fatias. Há N amigos e
cada amigo precisa de exatamente X fatias.Você deverá
criar um código capaz de calcular o número mínimo de 
pizzas que eles devem pedir para satisfazer seu apetite. 

 A primeira linha de entrada conterá um único inteiro T,
indicando o número de casos de teste.Cada caso de teste 
consiste em dois inteiros. N para o número de amigos e X
para a quantidade de fatia que cada amigo deseja.
 
 Para cada caso de teste, produza o número mínimo de pizzas
necessário, conforme o exemplo a baixo:

 Existe apenas 1 amigo que precisa 5 fatias. Se ele mandar
1 pizza, ele receberá apenas 4 fatias. Assim, pelo menos
2 pizzas devem ser encomendadas
para ter o número necessário de fatias.*/

import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {

        /*final int SLICE = 4;
        Scanner scanner = new Scanner(System.in);

        int pieces, T = scanner.nextInt();

        while(T-- > 0){
            pieces = scanner.nextInt() * scanner.nextInt();
            System.out.println(pieces/SLICE + (pieces%SLICE == 0 ? 0 : 1));
        }

        scanner.close();*/

        final int SLICE = 4;
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        while(T-- > 0){
            int N = scanner.nextInt();
            int X = scanner.nextInt();

            if((N * X) % SLICE == 0){
                System.out.println((N * X) / SLICE);
            }else{
                System.out.println((N * X) / SLICE + 1);
            }
        }
    }
    
}
