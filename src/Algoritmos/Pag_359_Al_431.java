package Algoritmos;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Pag_359_Al_431 {

    public static void main(String[] args) {

        int m[][] = new int[3][3];
        int fnl[][] = new int[3][3];

        Scanner scr = new Scanner(System.in);

        for (int l = 0; l <= 2; l++) {
            for (int c = 0; c <= 2; c++) {
                System.out.println("Digite um elemento " + l + 1 + " - " + c + 1 + " : ");
                m[l][c] = scr.nextInt();
            }
        }
        System.out.println("Matriz original: ");
        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m.length; c++) {
                System.out.print(m[l][c] + " ");
            }
            System.out.println("");
        }
        System.out.println("matriz gira 90 ");
        for (int c = 0; c <= 2; c++) {
            for (int l = 2; l >= 0; l--) {
                System.out.print(m[l][c] + " ");
            }
            System.out.println("");
        }
    }
}
