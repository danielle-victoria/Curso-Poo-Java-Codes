## Dominando Algoritmos Intermediários Com Desafios de Código Java 💻 
<br/>
<h3><b>Desafio de Código 1 - Fecha, Escudo ou Espada ✔️ </b></h3> 
<br/>  
<b>Desafio</b>  
  
Você e seus amigos estão em uma aula de criação de jogos. Para inspirar os alunos e treinar, o professor pediu para que vocês fizessem um jogo que já existe com alguma modificação. A escolha de vocês foi "Pedra, Papel e Tesoura" e a modificação foi mudar Pedra para Flecha, Papel para Escudo e Tesoura para Espada.

Então, vocês escolheram um número para representar cada um dos parâmetros. Sendo:

1 - Flecha  
2 - Escudo  
3 - Espada  

<b>Entrada</b>  
A entrada vão ser dois números representando cada um dos parâmetros. Sendo a primeira entrada o jogador e a segunda o inimigo.  

<b>Saída</b>  
A saída deve ser se o jogador ganhou, empatou ou perdeu após a análise das duas entradas. A saída deve ser sem as aspas.  


| Entrada | Saída |
|-- |-- |  
| 1 | "Empatou" |
| 1 |
| 1 | "Perdeu"  |
| 2 |
| 3 | "Ganhou"  |
| 2 |
   

<br/>
<h3><b>Desafio de Código 2 - Número Feliz ✔️ </b></h3> 
<br/>  
<b>Desafio</b>  

Um número feliz é um número definido pelo seguinte processo:

- Começando com qualquer número inteiro positivo, substitua o número pela soma dos quadrados de seus dígitos.
- Repita o processo até que o número seja igual a 1 (onde ficará), ou faça um loop infinito em um ciclo que não inclua 1.
- Aqueles números para os quais esse processo termina em 1 são felizes.
- Retorna true se n for um número feliz e false se não for.

Escreva um algoritmo para determinar se o número n é feliz.  

<b>Entrada</b>  
A entrada será feita por um número inteiro, correpondente ao valor de entrada para verificar se  o número é feliz ou não.  


<b>Saída</b>  
Retorne true, caso o número seja feliz, e retorne false, caso o número não seja feliz.  

| Entrada | Saída |
|-- |-- |  
| 19 | true |
| 2 | false |
        


<br/>
<h3><b>Desafio de Código 3 - Quantidade Necessária ✔️ </b></h3> 
<br/>  
<b>Desafio</b>   

Cada pizza é composta por 4 fatias. Há N amigos e cada amigo precisa de exatamente X fatias.
Você deverá criar um código capaz de calcular o número mínimo de pizzas que eles devem pedir para satisfazer seu apetite.  

<b>Entrada</b>  
A primeira linha de entrada conterá um único inteiro T, indicando o número de casos de teste.
Cada caso de teste consiste em dois inteiros. N para o número de amigos e X para a quantidade de fatia que cada amigo deseja.  


<b>Saída</b>   
Para cada caso de teste, produza o número mínimo de pizzas necessário, conforme o exemplo a baixo:

Existe apenas 1 amigo que precisa 5 fatias. Se ele mandar 1 pizza, ele receberá apenas 4 fatias. Assim, pelo menos 2 pizzas devem ser encomendadas
para ter o número necessário de fatias.     


| Entrada | Saída |
|-- |-- |  
| 1 | 2 |
| 1 |
| 5 |  
     



<br/>
<h3><b>Desafio de Código 4 - Diferença entre Dígitos ✔️ </b></h3> 
<br/>  
<b>Desafio</b>   

O desafio consiste em um número inteiro n, onde será necessário calcular a diferença entre o produto e a soma dos seus digitos.    

<b>Entrada</b>   
- Para encontrar o produto do valor, os dígitos deverão ser multiplicados.

- A soma, basta realizar uma adição entre os dígitos.

- A diferença, é necessário substrair o resultado final dos dois valores.   


<b>Saída</b>    
A saída deverá retornar o valor final da diferença entre o produto e a soma dos digitos.   


| Entrada | Saída |
|-- |-- |  
| 243 | 15 | 
     


<br/>
<h3><b>Desafio de Código 5 - Emboscada no RPG ✔️ </b></h3> 
<br/>  
<b>Desafio</b>   

Você e seus amigos estão jogando uma partida de RPG (Role-Playing Game) utilizando um dado de 10 lados. Em um determinado momento, em uma masmorra escura, o seu personagem foi emboscado por um terrível goblin. Como em todo bom RPG, temos alguns parâmetros que definem os status dos personagens:

<b>Vida:</b> Pontos que devem ser maiores que 0, se não o personagem morre.  
<b>Ataque:</b> Pontos que definem quanto de dano ele inflingirá nos outros personagens.  
<b>Defesa:</b> Pontos que definem quanto dano será mitigado quando ele levar um ataque.

O dado é um modificador desses parâmetros. Quando você joga o dado o valor dele deve ser somado ao seu <b>ataque</b> ou a sua <b>defesa</b>. Quando o valor do dado for maior que 8 e menor que 10, o jogador tira um crítico e essa soma deve ser <b>DOBRADA</b>.

O dano causado ao jogador é calculado dessa forma:  
<b>vidaDoJogador - (ataqueInimigo - (defesaDoJogador + dados))</b>  

O dano causado ao inimigo é calculado dessa forma:   
<b>vidaDoInimigo - (ataqueDoJogador + dados)</b>

Caso o jogador sobreviva a emboscada, ele <b>contra-ataca</b>.

Para deixar a jogatina mais rápida, fazendo o computador realizar as contas matemáticas, você decidiu criar esse programa para verificar se seu personagem vai sobreviver e contra-atacar ou morrer.   

<b>Entrada</b>   
A entrada serão seis parâmetros nessa ordem:  
Dados;  
Vida do Jogador;  
Ataque do Jogador;  
Defesa do Jogador;  
Vida do Inimigo;  
Ataque do Inimigo;  


<b>Saída</b>   
A saída deve ser verificado se o jogador sobreviveu ao ataque ou não. Caso ele tenha sobrevivido, verificar se o contra-ataque dele foi eficaz e matou o inimigo ou não. Em seguida, para cada caso, imprima na tela as respectivas ocorrências.      


| Entrada | Saída |
|-- |-- |  
| 2 | "Jogador nao sobreviveu" | 
| 6 |
| 6 |
| 4 |
| 5 |
| 14|
| 8 | "Jogador sobreviveu e derrotou o inimigo" |
| 6 |
| 6 |
| 4 |
| 5 |
| 14|
| 6 | "Jogador sobreviveu e nao derrotou o inimigo" |
| 12|
| 6 |
| 8 |
| 14|
| 7 |


