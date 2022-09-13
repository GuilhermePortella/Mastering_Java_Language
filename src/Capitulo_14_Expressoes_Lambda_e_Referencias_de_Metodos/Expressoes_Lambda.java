package Capitulo_14_Expressoes_Lambda_e_Referencias_de_Metodos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JButton;

/**
 *
 * @author Guilherme
 */
public class Expressoes_Lambda {

    public static void main(String[] args) {
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Ola mundo");
            }
        }).run();

        new Thread(() -> System.out.println("Ola mundo" + "2")).start();
        
        JButton JButton = new JButton();
        JButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ola mundo 3");
            }
        });
        
        JButton JButton2 = new JButton();
        JButton2.addActionListener(e -> System.out.println("Ola mundo 3!"));
        
        List<Integer> asList = Arrays.asList(1, 2, 3,  4, 5);
        asList.stream()
                .filter(e -> e % 2 == 0)
                .forEach(e -> System.out.println(e));
        //////////////////////////////////////////////////////////////////////
        List<Integer> lista = Arrays.asList(1, 5, 8, 9, 1, 4, 7, 6, 6, 9, 9);

        lista.stream()
                .skip(2)//Pula os 2(n) primeiros registros (n = qualquer numero)
                .forEach(e -> System.out.println(e));
        System.out.println("------------------------------------------------");
        //////////////////////////////////////////////////////////////////////
        List<Integer> lista2 = Arrays.asList(1, 5, 8, 9, 1, 4, 7, 6, 6, 9, 9);

        lista2.stream()
                .limit(2)//imprime somente os 2(n) elementos (n = qualquer numero)
                .forEach(e -> System.out.println(e));
        System.out.println("------------------------------------------------");
        //////////////////////////////////////////////////////////////////////
        List<Integer> lista3 = Arrays.asList(1, 5, 8, 9, 1, 4, 7, 6, 6, 9, 9);

        lista3.stream()
                .distinct()//não permite elementos repetidos (Utiliza equal e hastcode)
                .forEach(e -> System.out.println(e));
        System.out.println("------------------------------------------------");
        //////////////////////////////////////////////////////////////////////
        List<Integer> lista4 = Arrays.asList(1, 5, 8, 9, 1, 4, 7, 6, 6, 9, 9);
        lista4.stream()
                .filter(e -> e % 2 == 0) //filter implementa um filtro personalizado 
                .forEach(e -> System.out.println(e + "\n"));
        System.out.println("------------------------------------------------");
        //////////////////////////////////////////////////////////////////////

        List<String> list = new ArrayList<>();
        list.add("Bazinga");
        list.add("Guilherme");
        list.add("Almeida");
        list.add("Navaro");
        list.add(2, "Thor");
        list.add("Odin");
        list.add("Amy Ferrah");
        list.add("Sheldon");
        list.add("Penny");
        list.add("Leonard");
        list.add("Howard");
        list.add("Raj");
        list.add("Stuart");
        list.add("Arthur Jeffries");

        for (String ind : list) {
            System.out.println(ind);
        }
        System.out.println("--");
        
        list.remove("Thor");//remove o Thor

        for (String ind : list) {
            System.out.println(ind);
        }
        System.out.println("--");
        
        list.removeIf(x -> x.charAt(0) == 'A');//remove todos com nome que comeca com A

        for (String ind : list) {
            System.out.println(ind);
        }
        System.out.println("--");

        System.out.println(list.indexOf("Sheldon")); //imprime a posicao do elemento desejado
        System.out.println(list.indexOf("Amy Ferrah")); //imprime a posicao do elemento desejado
        System.out.println("--");

                              //converte para lambda    //funcao          //retorna para tipo lista
        List<String> result = list.stream().filter(e -> e.charAt(0) == 'B').collect(Collectors.toList());
        
        System.out.println("Nova lista");
        for (String ind : result) {
            System.out.println(ind);
        }
        System.out.println("--");
        
        String nome = list.stream().filter(e -> e.charAt(0) == 'G').findFirst().orElse(null);
        System.out.println(nome);

        System.out.println("------------------------------------------------");

    }
}