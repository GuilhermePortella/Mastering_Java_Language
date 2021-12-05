package Algoritmos.Logica;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Pag_189_Al_270 {
    
    public static void main(String[] args) {
        
        int num, a;
        
        Scanner scr = new Scanner(System.in);
        
        System.out.println("digite um numero ou -999 para acabar: ");
        num = scr.nextInt();
        
        while (num >-999) {
            System.out.println("1 ");
            for (a = 2; a <= num/2;a ++) {
                if (num % a == 0) {
                    System.out.println(a + " ");
                }
            }
            System.out.println(num);
            System.out.println("digite um numero ou -999 para acabar: ");
            num = scr.nextInt();
        }
        
        
    }
    
}
