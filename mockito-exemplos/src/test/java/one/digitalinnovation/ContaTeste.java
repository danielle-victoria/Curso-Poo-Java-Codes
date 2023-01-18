package one.digitalinnovation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import net.bytebuddy.asm.Advice.Argument;

@ExtendWith(MockitoExtension.class)
public class ContaTeste {

    @Spy
    private Conta conta = new Conta(3000);

    @Test
    void verificaSeChamouMetodoDebita() {
        conta.pagaBoleto(300);
        Mockito.verify(conta).debita(300);
    }

    @Test
    void verificaSeNadaFoiChamado() {
        Mockito.verifyNoInteractions(conta);
    }

    @Test
    void verificaAOrdemDasChamadas() {
        InOrder inOrder = Mockito.inOrder(conta);
        conta.pagaBoleto(300);
        conta.debita(300);
        conta.enviaCreditoParaEmissor(300);
        inOrder.verify(conta).pagaBoleto(300);
        inOrder.verify(conta).debita(300);
        inOrder.verify(conta).enviaCreditoParaEmissor(300);
    }

    @Test
    void validaQuantidadeDeVezesQueMétodoFoiChamado() {

        conta.validaSaldo(100);
        conta.validaSaldo(100);
        conta.validaSaldo(100);

        Mockito.verify(conta, Mockito.times(3)).validaSaldo(100);
    }

    @Test
    void retornaTrueParaQualquerValorNaValidacaoDeSaldo(){
        Mockito.doNothing().when(conta).validaSaldo(ArgumentMatchers.anyInt());
        conta.validaSaldo(3500);
    }
    
}
