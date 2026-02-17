/*
    Ler no numero de termos da serie (N) e imprima o valor de S, sendo:

    S = 1/N + 1/N-1 + 3/N-2 + ... + N-1/2 + N

 */
package Algoritmos.Logica;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Pag_165_Al_238 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int c, num, n;
        double h;

        h = 0;

        System.out.println("Digite numero: ");
        num = scr.nextInt();
        n = num;
        for (int i = 1; i < num; i++) {
            h = h + i / n;
            n = n - 1;
        }
        System.out.println("Soma: " + h);
    }
}
