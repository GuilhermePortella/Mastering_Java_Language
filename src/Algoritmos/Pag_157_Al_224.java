package Algoritmos;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Pag_157_Al_224 {
    
    public static void main(String[] args) {
        
        int a;
        String nome;
        
        Scanner scr = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        nome = scr.nextLine();
        
        for (a = nome.length(); a >= 0; a--) {
            System.out.println(nome.substring(a));            
        }
        
    }
    
}
