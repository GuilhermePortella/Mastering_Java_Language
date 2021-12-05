/*
    ler 4 numeros e imprimir o cubo e a raiz cubica de cada numero
 */
package Algoritmos.Logica;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Pag_139_Al_186 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int a;
        double numero;

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite um numero: ");
            numero = scr.nextDouble();

            System.out.println("Cubo: " + Math.pow(numero, 3));
            if (numero < 0) {
                System.out.println("Nao se faz raiz de numero negativo *~*");
            } else {
                System.out.println("Raiz: " + Math.cbrt(numero));
            }
        }
    }
}
