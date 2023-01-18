package one.digitalinnovation;

import java.util.List;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;


//@ExtendWith(MockitoExtension.class) //Sempre incluir essa extensão ao usar Mockito --> OBS.://Problema com Exceção "NullPointerExceptions" na linha Mockito.when()...
@RunWith(MockitoJUnitRunner.class)
public class ListaTeste {

    @Mock
    private List<String> letras;

    @Test
    public void adicionarItemNaLista(){
        
        Mockito.when(letras.get(0)).thenReturn("B");

        Assertions.assertEquals("B", letras.get(0));
    }
    
}
