/*As relações: Heranças, Associação e Interface */

/*Analise do comportamento de Polimorfismo e Sobescrita -
 Polimorfismo e Sobescrita - Parte 2
 */

package AsRelacoes.PolimorfismoSobrescrita;

public class ClasseFilha2 extends ClasseMae {

    @Override
    void metodo1(){

        System.out.println("Método 1 da Classe Filha 2.");
    }

    @Override
    void metodo2(){

        System.out.println("Método 2 da Classe Filha 2.");
    }
    
}
