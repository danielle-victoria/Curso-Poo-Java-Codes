/*A Organização de Pacotes e Visibilidade */

/*Visibilidades */


package Organizacao;

public class Classe3 {

    //Associação com a Classe1
    Classe1 classe1;
    
    void metodo(){

        /*Tem acesso aos métodos 2 e 3
        da Classe1*/

        classe1.metodo2();
        classe1.metodo3();

    }

    /*Tem acesso aos atributos 2 e 3
        da Classe1*/
}
