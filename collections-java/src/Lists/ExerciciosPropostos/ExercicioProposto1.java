package Lists.ExerciciosPropostos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média dos 6 
 primeiros meses do ano e armazene-as em uma lista.
 Após isto, calcule a média semestral das temperaturas e
 mostre todas as temperaturas acima desta média, e em que 
 mês elas ocorreram (mostrar o mês por extenso: 1 - Janeiro,
 2 - Fevereiro e etc).
 */

public class ExercicioProposto1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Double> temperaturas = new ArrayList<>();

        //System.out.println(temperaturas);

        /*Recebe a temperatura média dos 6 primeiros meses do 
        ano e armazena ela na lista temperaturas.*/
        for(int i = 0; i < 6; i++){
            double temp = scan.nextDouble();
            temperaturas.add(temp);
            
        }

        //System.out.println(temperaturas);

        //Calcula a média semestral das temperaturas
        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Média de temperatura: " + (soma/(temperaturas.size())));
        
        /*Mostra todas as temperaturas acima da média semestral
         e em que mês elas ocorreram */
        for(Double temp : temperaturas){
            if(temp > (soma/(temperaturas.size()))){
                System.out.println(temp);
                int indice = temperaturas.indexOf(temp);
                
                switch(indice){
                    case 0:
                        System.out.println("1 - Janeiro");
                        break;

                    case 1:
                        System.out.println("2 - Fevereiro");
                        break;

                    case 2:
                        System.out.println("3 - Março");
                        break;

                    case 3:
                        System.out.println("4 - Abril");
                        break;

                    case 4:
                        System.out.println("5 - Maio");
                        break;

                    case 5:
                        System.out.println("6 - Junho");
                        break;

                    default:
                        break;

                }
            }        
        }
            
    }
    
}
