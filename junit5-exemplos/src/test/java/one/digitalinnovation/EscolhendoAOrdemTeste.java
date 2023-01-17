package one.digitalinnovation;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestClassOrder;
import org.junit.jupiter.api.TestMethodOrder;

/*@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoAOrdemTeste {

    @Order(4)
    @Test
    public void validaFluxoA(){
        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    public void validaFluxoB(){
        Assertions.assertTrue(true); 
    }

    @Order(2)
    @Test
    public void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    public void validaFluxoD(){
        Assertions.assertTrue(true);
    }
    
}*/

//Outra forma - Ordem alfabética

/*@TestMethodOrder(MethodOrderer.MethodName.class)
public class EscolhendoAOrdemTeste {

   
    @Test
    public void validaFluxoA(){
        Assertions.assertTrue(true);
    }


    @Test
    public void validaFluxoB(){
        Assertions.assertTrue(true); 
    }

   
    @Test
    public void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    
    @Test
    public void validaFluxoD(){
        Assertions.assertTrue(true);
    }
    
}*/

//Outra forma - Aleatória
/*@TestMethodOrder(MethodOrderer.Random.class)
public class EscolhendoAOrdemTeste {

   
    @Test
    public void validaFluxoA(){
        Assertions.assertTrue(true);
    }


    @Test
    public void validaFluxoB(){
        Assertions.assertTrue(true); 
    }

   
    @Test
    public void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    
    @Test
    public void validaFluxoD(){
        Assertions.assertTrue(true);
    }
    
}*/

//Outra forma - Display name - Nomear o teste de alguma forma
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemTeste {

    //@DisplayName("A")
    @DisplayName("Teste que valida se o usuário foi criado")
    @Test
    public void validaFluxoA(){
        Assertions.assertTrue(true);
    }

    @DisplayName("B")
    @Test
    public void validaFluxoB(){
        Assertions.assertTrue(true); 
    }

    @DisplayName("C")
    @Test
    public void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    @DisplayName("D")
    @Test
    public void validaFluxoD(){
        Assertions.assertTrue(true);
    }
    
}



