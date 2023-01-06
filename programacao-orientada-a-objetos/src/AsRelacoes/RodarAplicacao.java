package AsRelacoes;

public class RodarAplicacao {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        //upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //downcast - Pouco usado
        //Gerente gerente_ = new Funcionario(); //Erro
        //Vendedor vendedor_ = (Vendedor) new Funcionario(); Erro //Downcast de forma explícita
        //Downcast deve ser evitado na OO
    }
    
}
