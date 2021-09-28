package Capitulo_2;

/**
 *
 * @author Guilherme
 * 
 * Demonstra a conversão automatica de long para doble
 */
public class LtoD {
    public static void main(String args[]){
        long L;
        double D;
        
        L = 100123285L;
        D = L; //conversão automatica de long para double
        
        System.out.println("L and D: "+ L + ""+ D);
    }
}
