/* Aula sobre estrutura básica da OO */

/*Crie a classe "Carro"   - Classe - Parte 1*/

/*Evolua o exercício 1 e defina 3 atributos para
  sua classe "Carro": cor, modelo e capacidade do 
  tanque  - Atributos - Parte 2*/

/*Evolua o conceito do exercício 2 e defina 1 método
  para calcular o valor total para encher o tanque.
  Este deve receber como parâmetro o valor da gasolina.
  Faça também duas sobrecargas do construtor - Método -
  Parte 3*/

  /*Evolua o conceito do exercício 3 criando objetos da
    classe "Carro". Use os métodos set/get, quando aplicáveis,
    para definir os valores dos atributos e exibir estes valores
    "get". Passe também uma mensagem para o cálculo do total para
    encher o tanque. - Objeto e Mensagem - Parte 4*/

  /*Crie a classe "Veiculo", "Carro", "Moto" e "Caminhao" - Herança
    - Parte 5*/

package EstruturaBasicaOO;

public class Carro {

    String cor;
    String modelo;
    int capacidadeTanque;

    Carro(){}
    Carro(String cor, String modelo, int capacidadeTanque){
        //this.atributo = parâmetro
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    String getCor(){
        return cor;
    }
    
    void setCor(String cor){
        this.cor = cor;
    }

    String getModelo(){
        return modelo;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}
