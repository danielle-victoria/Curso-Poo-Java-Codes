package one.digitalinnovation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;

public class CondicionaisTeste {

/*@Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "willyan")
    void validarAlgoSomenteNoUsuarioWillyan(){
       //Assumptions.assumeTrue("root".equals(System.getenv("USER"))); 
       Assertions.assertEquals(10, 5 + 5);
    }*/
    
    /*@Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
    void validarAlgoSomenteNoUsuarioWillyan(){
       //Assumptions.assumeTrue("root".equals(System.getenv("USER"))); 
       Assertions.assertEquals(10, 5 + 5);
    }*/

    /*@Test
    @EnabledOnOs(OS.LINUX)
    void validarAlgoSomenteNoUsuarioWillyan(){
        //Assumptions.assumeTrue("root".equals(System.getenv("USER"))); 
        Assertions.assertEquals(10, 5 + 5);
    }*/

    @Test
    @EnabledOnOs({OS.LINUX, OS.MAC})
    void validarAlgoSomenteNoUsuarioWillyan(){
        //Assumptions.assumeTrue("root".equals(System.getenv("USER"))); 
        Assertions.assertEquals(10, 5 + 5);
    }

    
}