package Algoritmos;

import java.util.Scanner;
public class Pag_123_Al_160 {
    
    public static void main(String[] args) {
        
        double x,y;
        
        Scanner scr = new Scanner(System.in);
        
        System.out.print("Digite o valor de x: ");
        x = scr.nextDouble();
        if (x <= 1) {
            y = 1;            
        }else{
            if (x <= 2) {
                y = 2;                
            }else{
                if (x <= 3) {
                    y = x *  2;                    
                }else{
                    y = x * 3;
                }
            }
        }
        System.out.print("Valor de f(x): " + y);
    }
    
}
