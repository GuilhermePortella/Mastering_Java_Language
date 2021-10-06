package Capitulo_4;

/**
 *
 * @author Guilherme
 */
public class AddMeth {
    
    public static void main(String[] args) {
        
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();
        
        int range1, range2;
        
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        
        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;
        
        System.out.print("Minivan can carry " + minivan.passengers + ". ");
        minivan.ranger();
        System.out.print("Sportcar can carry " + sportcar.passengers + ". ");
        sportcar.ranger();
    }
}
