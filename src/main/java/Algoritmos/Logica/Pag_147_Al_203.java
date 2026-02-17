package Algoritmos.Logica;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Pag_147_Al_203 {

    public static void main(String[] args) {
        int i, num;
        double num1;

        Scanner scr = new Scanner(System.in);

        System.out.print("Quantos numeros voce quer digitar? ");
        num = scr.nextInt();

        for (i = 1; i <= num; i++) {
            System.out.print("Digite o " + i + " numero de " + num + ": ");
            num1 = scr.nextDouble();
            System.out.println(num1 * 3);
        }

        scr.close();
    }

}
