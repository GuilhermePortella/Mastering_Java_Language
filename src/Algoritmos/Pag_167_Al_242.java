/*
    Imprime a tabuada
 */
package Algoritmos;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Pag_167_Al_242 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int c, n;
        
        System.out.println("Qual a tabuada que deseja? ");
        n = scr.nextInt();
        if (n > 0) {
            System.out.println("Tabuada do: " + n);
            for (int i = 1; i < 11; i++) {
                System.out.println(n + " x " + i + " = " + n*i);                
            }
        }
    }
}
