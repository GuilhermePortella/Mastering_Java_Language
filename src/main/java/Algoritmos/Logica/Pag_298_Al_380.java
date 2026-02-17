package Algoritmos.Logica;

import java.util.Scanner;

public class Pag_298_Al_380 {

    public static void main(String[] args) {

        int[] num = new int[30];

        Scanner scr = new Scanner(System.in);

        for (int i = 0; i < 29; i++) {
            System.out.print("Digite o numero: ");
            num[i] = scr.nextInt();
        }

        System.out.print("Vetor ao Contrario: ");
        for (int i = 29; i >= 0; i--) {
            System.out.println(num[i]);
        }
        scr.close();
    }
}
