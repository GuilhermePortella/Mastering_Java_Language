package Algoritmos.Logica;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Pag_138_Al_183 {

    public static void main(String[] args) {

        double numero = 0;
        Scanner scr = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {
            System.out.print("Digite o numero: ");
            numero = scr.nextInt();
            System.out.println("Quadrado: " + numero * numero);
        }

        PriorityQueue<Double> as = new PriorityQueue<>();

        // as.add(as); // Error: Cannot add the queue to itself
        as.add(numero);

        scr.close();
    }
}
