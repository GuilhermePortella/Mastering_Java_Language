package Capitulo_14;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author Guilherme
 */
public class Expressoes_Lambda {

    public static void main(String[] args) {
        //////////////////////////////////////////////////////////////////////
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Ola mundo");
//            }
//        }).run();
//
//        new Thread(() -> System.out.println("Ola mundo" + "2")).start();
        //////////////////////////////////////////////////////////////////////
//        JButton JButton = new JButton();
//        JButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Ola mundo 3");
//            }
//        });
        //////////////////////////////////////////////////////////////////////
//        JButton JButton2 = new JButton();
//        JButton2.addActionListener(e -> System.out.println("Ola mundo 3!"));
//        
//        List<Integer> asList = Arrays.asList(1, 2, 3,  4, 5);
//        asList.stream()
//                .filter(e -> e % 2 == 0)
//                .forEach(e -> System.out.println(e));
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
                .forEach(e -> System.out.println(e));
        System.out.println("------------------------------------------------");
    }
}
