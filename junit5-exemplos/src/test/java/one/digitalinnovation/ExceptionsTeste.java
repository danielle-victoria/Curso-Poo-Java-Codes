package one.digitalinnovation;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.util.*;

public class ExceptionsTeste {
    

    @Test
    public void validarCenarioDeExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456548", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
        
       /*Assertions.assertThrows(IllegalArgumentException.class, () -> 
                transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));*/
        //Verifica se nehuma exceção vai ser lançada
        //Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));
    }
}
