/*Utilizando listas, faça um programa que faça 5
 perguntas para uma pessoa sobre um crime. As 
 perguntas são:

 1. "Telefonou para a vítima?"
 2. "Esteve no local do crime?"
 3. "Mora perto da vítima?"
 4. "Devia para a vítima?"
 5. "Já trabalhou com a vítima?"

Se a pessoa responder positivamente a 2 questões
ela deve ser classificada como "Suspeita", entre
3 e 4 como "Cúmplice" e 5 como "Assassina". Caso
contrário, ela será classificada como "Inocente".
 */

package Lists.ExerciciosPropostos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ExercicioProposto2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        List<Boolean> respostas = new ArrayList<>();

        //Faz 5 perguntas para uma pessoa sobre um crime.

        System.out.println("Telefonou para a vítima? S/N");
        String resp1 = scan.nextLine();
        if(resp1.equals("S")) respostas.add(true);
        else respostas.add(false);

        System.out.println("Esteve no local do crime? S/N");
        String resp2 = scan.nextLine();
        if(resp2.equals("S")) respostas.add(true);
        else respostas.add(false);

        System.out.println("Mora perto da vítima? S/N");
        String resp3 = scan.nextLine();
        if(resp3.equals("S")) respostas.add(true);
        else respostas.add(false);

        System.out.println("Devia para a vítima? S/N");
        String resp4 = scan.nextLine();
        if(resp4.equals("S")) respostas.add(true);
        else respostas.add(false);

        System.out.println("Já trabalhou com a vítima? S/N");
        String resp5 = scan.nextLine();
        if(resp5.equals("S")) respostas.add(true);
        else respostas.add(false);

        System.out.println(respostas);

        int count = 0;
        for(Boolean resps : respostas){
            if(resps == true) count++;
        }

        /*Determina a classificação da pessoa como:
        inocente, suspeita, cúmplice ou assassina*/
        switch(count){
            case 0:
            case 1:
                System.out.println("Inocente");
                break;
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassina");
                break;
            default:
                break;
        }        
        
    }    
    
}
