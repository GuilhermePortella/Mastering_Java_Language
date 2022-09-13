package Capitulo_4_Introducao_a_Classes_Objetos_e_Metodos;

/**
 *
 * @author Guilherme
 */
public class VehConsDemo {
    
    public static void main(String[] args) {
        
        Vehicle3 minivan = new Vehicle3(7, 16, 21);
        Vehicle3 sportcar = new Vehicle3(2, 14, 12);
        double gallons;
        int dist = 252;
        
        gallons = minivan.fluelneeded(dist);
        
        System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");
        
        gallons = sportcar.fluelneeded(dist);
        
        System.out.println("To go " + dist + " miles Sportcar needs " + gallons + " gallons of fuel.");
    }   
}