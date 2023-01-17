package one.digitalinnovation;

import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

//import estático
/*import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.* */

public class AssertionsTeste {
    
    @Test
    public void validarLancamento() {

        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        //int[] segundoLancamento = {10, 5, 2, 3, 10};
        int[] segundoLancamento = {10, 20, 30, 40 , 50};
                                   // esperado           //atual      
        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento); //Analisa se os arrays são iguais
        //Assertions.assertNotEquals(primeiroLancamento, segundoLancamento); //Analisa se os arrays são diferentes
        //assertArrayEquals(primeiroLancamento, segundoLancamento); //Usando import static
    }

    @Test
    public void validarObjetoEstaNulo(){
        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDateTime.now());
        //Assertions.assertNull(pessoa); //Verifica se o objeto está nulo
        Assertions.assertNotNull(pessoa); //Verifica se o objeto não está nulo
    }

    @Test
    public void validarNumeroDeTipoDiferente(){
        double valor = 5.0;
        double outroValor = 5.0;

        Assertions.assertEquals(valor, outroValor); //Verifica se os valores são iguais
    }
}
