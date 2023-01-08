/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

package Set.ExerciciosPropostos;
import java.util.*;

public class ExercicioProposto1 {
    public static void main(String[] args) {
        
        Set<String> cores = new HashSet<>();
        //Itens repetidos não são adicionados
        cores.add("vermelho");
        cores.add("laranja");
        cores.add("amarelo");
        cores.add("verde");
        cores.add("azul");
        cores.add("azul-escuro");
        cores.add("violeta");
        
        System.out.println("\na) Exiba todas as cores o arco-íris uma abaixo da outra: ");
        for(String coresArcoIris : cores) System.out.println(coresArcoIris);

        System.out.println("\nb) A quantidade de cores do arco-íris: " + cores.size());

        System.out.println("\nc) Exiba as cores em ordem alfabética: ");
        Set<String> cores2 = new TreeSet<>(cores);
        System.out.println(cores2);

        System.out.println("\nd) Exiba as cores na ordem inversa da que foi informada");
        Set<String> cores3 = new LinkedHashSet<>(
                Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "azul-escuro", "violeta"));
        List<String> coresList = new ArrayList<>(cores3);
        Collections.reverse(coresList);
        System.out.println(coresList);


        System.out.println("\ne) Exiba todas as cores que começam com a letra ”v”");
        for (String cor: cores) {
            if(cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("\nf)Remova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator = cores.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().startsWith("v")) iterator.remove();
        }
        System.out.println(cores);

        System.out.println("\ng) Limpe o conjunto: ");
        cores.clear();
        System.out.println(cores);    

        System.out.println("\nh) Confira se o conjunto está vazio: " + cores.isEmpty());
    }
}
    



