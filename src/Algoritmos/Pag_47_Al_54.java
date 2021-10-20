package Algoritmos;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Pag_47_Al_54 {
    
    public static void main(String[] args) {
        
        double a, b;
        
        Scanner scr = new Scanner(System.in);
        
        System.out.print("Entre com a base: ");
        a = scr.nextDouble();
        
        System.out.print("Entre com a altura do triangulo: ");
        b = scr.nextDouble();
        
        System.out.print("Area = " + (a*b)/2 + "\n");
    }
    
}
