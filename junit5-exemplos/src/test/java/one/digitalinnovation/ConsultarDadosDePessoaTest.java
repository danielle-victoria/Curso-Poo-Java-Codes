package one.digitalinnovation;

import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
        
    }

    @BeforeEach
    public void insereDadosParaTeste(){
        BancoDeDados.insereDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @AfterEach
    public void removeDadosDoTeste(){
        BancoDeDados.removeDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @Test
    public void validarDadosDeRetorno(){
        Assertions.assertTrue(true);

    }

    @Test
    public void validarDadosDeRetorno2(){
        Assertions.assertNull(null);

    }


    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
        
    }
    
}
