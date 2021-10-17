package Capitulo_4;

/**
 *
 * @author Guilherme
 */
public class RetMeth {
    
    public static void main(String[] args) {
        
        Vehicle2 minivan = new Vehicle2();
        Vehicle2 sportcar = new Vehicle2();
        
        int range1, range2;
        
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        
        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;
        
        range1 = minivan.range();
        range2 = sportcar.range();
        
        System.out.println("Minivan can carry " + minivan.passengers + " with range of " + range1 + " Miles");
        System.out.println("Sportcar can carry " + sportcar.passengers + " with range of " + range2 + " Miles");
        
    }
    
    
}
