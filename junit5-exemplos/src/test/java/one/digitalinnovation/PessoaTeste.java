package one.digitalinnovation;


import java.time.LocalDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;;


public class PessoaTeste {

    @Test // --> Notação primordial para testar
    void deveCalcularIdadeCorretamente(){
        //Criação do cenário
        Pessoa jessica = new Pessoa("Jéssica",  LocalDateTime.of(2000,1,1,15,0,0));
        //Execução de validações
        Assertions.assertEquals(23, jessica.getIdade()); //Verifica se a idade é igual a 23
                   //assertEquals(esperado, o que está sendo chamado) 
    }

    @Test // --> Notação primordial para testar
    void deveRetornarSeEhMaiorDeIdade(){
        //Criação do cenário
        Pessoa jessica = new Pessoa("Jéssica",  LocalDateTime.of(2000,1,1,15,0,0));
        //Execução de validações
        Assertions.assertTrue(jessica.ehMaiorDeIdade());  //Verifica se a pessoa é maior de idade

        //Criação do cenário
        Pessoa joao = new Pessoa("João",  LocalDateTime.now());
        //Execução de validações
        Assertions.assertFalse(joao.ehMaiorDeIdade());  //Verifica se a pessoa não é maior de idade
    }


    
}
