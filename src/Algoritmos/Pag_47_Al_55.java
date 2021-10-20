package Algoritmos;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Pag_47_Al_55 {
    
    public static void main(String[] args) {
        
        double diagMaior, diagMenor, area;
        
        Scanner scr = new Scanner(System.in);
        
        System.out.print("Medida da diagonal maior: ");
        diagMaior = scr.nextDouble();
        
        System.out.print("Medida da diagonal menor: ");
        diagMenor = scr.nextDouble();
        
        area = (diagMaior * diagMenor)/2;
        
        System.out.println("Area = " + area);
    }
    
}
