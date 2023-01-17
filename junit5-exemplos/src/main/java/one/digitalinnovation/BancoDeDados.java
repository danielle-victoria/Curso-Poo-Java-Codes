package one.digitalinnovation;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());
    
    public static void iniciarConexao(){
        //Fez algo
        LOGGER.info("Iniciou conexão");
    }

    public static void finalizarConexao(){
        //Fez algo
        LOGGER.info("Finalizou conexão");
    }

    public static void insereDados(Pessoa pessoa){
        //insere pessoa no DB
        LOGGER.info("Inseriu dados");
    }

    public static void removeDados(Pessoa pessoa){
        //remove pessoa no DB
        LOGGER.info("Removeu dados");
    }


    
}
