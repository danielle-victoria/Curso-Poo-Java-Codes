package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.junit.jupiter.api.Assertions;
//import org.junit.runner.RunWith;
//import org.mockito.junit.MockitoJUnitRunner;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class EnviarMensagemTeste {

        @Spy
        EnviarMensagem enviarMensagem = new EnviarMensagem();
    
        /*@Test
        void adicionarMensagem() {
            Mensagem mensagem = new Mensagem("Hello World");
    
            enviarMensagem.adicionarMensagem(mensagem);
    
            verify(enviarMensagem).adicionarMensagem(mensagem);
    
            Assertions.assertEquals(1, enviarMensagem.getMensagens().size());
        }*/

        @Test
        void verificarComportamentoDaClasse(){
            Mockito.verifyNoInteractions(enviarMensagem);

            Mensagem mensagem = new Mensagem("Hello World");
    
            enviarMensagem.adicionarMensagem(mensagem);
    
            Mockito.verify(enviarMensagem).adicionarMensagem(mensagem);

            Assertions.assertFalse(enviarMensagem.getMensagens().isEmpty());
    

        }
    
}
