package Algoritmos.Logica;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Pag_155_Al_219 {

    public static void main(String[] args) {

        int c, num;
        String palavra;

        Scanner scr = new Scanner(System.in);

        System.out.print("Digite a palavra a ser repetida: ");
        palavra = scr.nextLine();

        System.out.print("Digite o numero de vezes que vc deseja repetir a palavar: " + palavra + " ");
        num = scr.nextInt();

        for (c = 1; c <= num; c++) {
            System.out.println(palavra);
        }
        scr.close();
    }

}
