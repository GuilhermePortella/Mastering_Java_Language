package Algoritmos;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class FizzBuzz {
    
    public static void fizzBuzz(int n) {
        
        int[] lista = new int[n];
        
        for (int i = 0; i < lista.length; i++) {
            lista[i] = i + 1;
        }
        
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 3 == 0 && lista[i] % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (lista[i] % 3 == 0 && lista[i] % 5 != 0) {
                System.out.println("Fizz");
            } else if (lista[i] % 5 == 0 && lista[i] % 3 != 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(lista[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int number;
        
        System.out.print("Digite um numero: ");
        number = scr.nextInt();
        
        fizzBuzz(number);
        
    }
}
