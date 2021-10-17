package Capitulo_4;

/**
 *
 * @author Guilherme
 */
public class Vehicle3 {

    int passengers;
    int fuelcap;
    int mpg;

    public Vehicle3(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }
     int range() {
         return mpg * fuelcap;
     }
     
     double fluelneeded(int miles) {
         return (double) miles/mpg;
     }
}
