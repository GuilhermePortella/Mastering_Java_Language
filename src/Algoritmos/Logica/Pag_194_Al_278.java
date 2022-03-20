package Algoritmos.Logica;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Pag_194_Al_278 {

    public static void main(String[] args) {

        int num, cont, num1;

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        num = scr.nextInt();

        cont = 0;
        num1 = 2;

        while (cont == 0 && num1 <= num / 2) {
            if (num % num1 == 0) {
                cont = 1;

            }
            num1++;

        }
        if (cont == 1) {
            System.out.println("Nao e primo");
        } else {
            System.out.println("Primo");
        }

    }

}
