package one.digitalinnovation;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.anyString;


@RunWith(MockitoJUnitRunner.class)
public class CadastrarPessoaTeste {

    /*@BeforeAll
    void setup(){
        MockitoAnnotations.initMocks(this);
    }

    private ApiDosCorreios apiDosCorreios = Mockito.mock(ApiDosCorreios.class);*/
    

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks  //Injetando o Mock da ApidosCorreios na classe CadastrarPessoa
    private CadastrarPessoa cadastrarPessoa;

    @Test
    public void validarDadosDeCadastro(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("PB", "João Pessoa", "Rua 2", "Apto", "Centro");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("5846266-300")).thenReturn(null);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Danielle", "54795125525", LocalDate.now(), "5846266-300");

        assertEquals("Danielle", pessoa.getNome());
        assertEquals("54795125525", pessoa.getDocumento());
        assertEquals("PB", dadosLocalizacao.getUf());
        assertEquals("Apto", dadosLocalizacao.getComplemento());

    }


}
