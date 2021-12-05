package Algoritmos.Logica;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Pag_83_Al_103 {
    
    public static void main(String[] args) {
        
        int anon, anoa;
        
        Scanner scr = new Scanner(System.in);
        
        System.out.print("Entre com ano atual: ");
        anoa = scr.nextInt();
        System.out.print("Entre com o ano de nascimento: ");
        anon = scr.nextInt();
        
        if (anon > anoa) {
            System.out.print("Ano de nascimento invalido");            
        }else {
            System.out.println("Idade " + (anoa-anon));
        }
        
    }
    
}
