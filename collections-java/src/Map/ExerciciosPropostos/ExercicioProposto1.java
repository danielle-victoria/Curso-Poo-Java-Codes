/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265

 a) Crie um dicionário e relacione os estados e suas populações;
 b) Substitua a população do estado do RN por 3.534.165;
 c) Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
 d) Exiba a população PE;
 e) Exiba todos os estados e suas populações na ordem que foi informado;
 f) Exiba os estados e suas populações em ordem alfabética;
 g) Exiba o estado com o menor população e sua quantidade; 
 h) Exiba o estado com a maior população e sua quantidade;
 i) Exiba a soma da população desses estados;
 j) Exiba a média da população deste dicionário de estados;
 k) Remova os estados com a população menor que 4.000.000;
 l) Apague o dicionário de estados;
 m) Confira se o dicionário está vazio.
 
 */

package Map.ExerciciosPropostos;
import java.util.*;

public class ExercicioProposto1 {
    public static void main(String[] args) {
        
        //a) Crie um dicionário e relacione os estados e suas populações;
        System.out.println("\nCrie um dicionário e relacione os estados e suas populações: ");
        Map<String, Integer> estadosNordeste = new HashMap<String, Integer>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            
        }};
        System.out.println(estadosNordeste.toString());

        //b) Substitua a população do estado do RN por 3.534.165;
        System.out.println("\nSubstitua a população do estado do RN por 3.534.165: ");
        estadosNordeste.put("RN", 3534165);
        System.out.println(estadosNordeste);

        //c) Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
        System.out.println("\nConfira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277: " + estadosNordeste.containsKey("PB"));
        if(! (estadosNordeste.containsKey("PB"))) estadosNordeste.put("PB", 4039277 );
        System.out.println(estadosNordeste);

        //d) Exiba a população PE;
        System.out.println("\nExiba a população PE: " + estadosNordeste.get("PE"));

        //e) Exiba todos os estados e suas populações na ordem que foi informado;
        System.out.println("\n--\tOrdem Inserção\t--");
        Map<String, Estados> estadosNordeste1 = new LinkedHashMap<String, Estados>() {{
            put("PE", new Estados(9616621));
            put("AL", new Estados(3351543));
            put("CE", new Estados(9187103));
            put("RN", new Estados(3534265));
            put("PB", new Estados (4039277) );
        }};
        for (Map.Entry<String, Estados> estados : estadosNordeste1.entrySet())
            System.out.println(estados.getKey() + " - " + estados.getValue().getPopulacao());

        
        //f) Exiba os estados e suas populações em ordem alfabética;
        System.out.println("\n--\tOrdem alfabética os estados e suas populações\t--");
        Map<String, Estados> estadosNordeste2 = new TreeMap<>(estadosNordeste1);
        for (Map.Entry<String, Estados> estados : estadosNordeste2.entrySet())
            System.out.println(estados.getKey() + " - " + estados.getValue().getPopulacao());

        
        //g) Exiba o estado com o menor população e sua quantidade;
        Integer menorQuantidade = Collections.min(estadosNordeste.values());
        Set<Map.Entry<String, Integer>> entries = estadosNordeste.entrySet();
        String menorPopulacao = "";

        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(menorQuantidade)) {
                menorPopulacao = entry.getKey();
                System.out.println("\nEstado com o menor população e sua quantidade: " + menorPopulacao + " - " + menorQuantidade);
            }
        }

        //h) Exiba o estado com a maior população e sua quantidade;
        Integer maiorQuantidade = Collections.max(estadosNordeste.values());
        String maiorPopulacao = "";

        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(maiorQuantidade)) {
                maiorPopulacao = entry.getKey();
                System.out.println("\nEstado com o maior população e sua quantidade: " + maiorPopulacao + " - " + maiorQuantidade);
            }
        }

        //i) Exiba a soma da população desses estados;
        Iterator<Integer> iterator = estadosNordeste.values().iterator();
        Integer soma = 0;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("\nExiba a soma da população desses estados: " + soma);

        //j) Exiba a média da população deste dicionário de estados;
        System.out.println("\nExiba a média da população deste dicionário de estados: " + (soma/estadosNordeste.size()));

        //k) Remova os estados com a população menor que 4.000.000;
        System.out.println("\nRemova os estados com a população menor que 4.000.000: ");
        System.out.println(estadosNordeste);
        Iterator<Integer> iterator1 = estadosNordeste.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next() < 4000000) iterator1.remove();
        }
        System.out.println(estadosNordeste);

        //l) Apague o dicionário de estados;
        System.out.println("\nApague o dicionário de estados: ");
        estadosNordeste.clear();
        System.out.println(estadosNordeste);

        //m) Confira se o dicionário está vazio.
        System.out.println("Confira se o dicionário está vazio: " + estadosNordeste.isEmpty());

    }
    
}


class Estados {
    
    private Integer populacao;

    public Estados(Integer populacao) {
       
        this.populacao = populacao;
    }

   
    public Integer getPopulacao() {
        return populacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estados livro = (Estados) o;
        return populacao.equals(livro.populacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(populacao);
    }

    @Override
    public String toString() {
        return "Estados{" +
                ", populacao=" + populacao +
                '}';
    }
}
