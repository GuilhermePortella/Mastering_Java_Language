package Algoritmos.Logica;

/*
Entrar com 10 numeros (positivos e negativos) e 
imprima o maior e o menor numero 
*/
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Pag_163_Al_235 {

    public static void main(String[] args) {

        double num1, maior, menor;

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        num1 = scr.nextDouble();
        maior = num1;
        menor = num1;

        for (int j = 0; j < 9; j++) {
            System.out.println("Digite um numero: ");
            num1 = scr.nextDouble();
            if (num1 > maior) {
                maior = num1;
            } else {
                if (num1 < menor) {
                    menor = num1;
                }
            }
        }
        System.out.println("Maior numero digitado: " + maior);
        System.out.println("Menor numero digitado: " + menor);

        scr.close();
    }
}
