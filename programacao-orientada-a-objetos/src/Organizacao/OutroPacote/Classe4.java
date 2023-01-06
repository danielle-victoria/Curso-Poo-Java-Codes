/*A Organização de Pacotes e Visibilidade */

/*Visibilidades */

package Organizacao.OutroPacote;
import Organizacao.Classe1;

public class Classe4 {

    Classe1 classe1;

    void metodo(){
        
        /*Tem acesso apenas ao método 3
         da Classe1*/

         classe1.metodo3();
    }


    /*Tem acesso apenas ao atributo 3
         da Classe1*/

    
}
