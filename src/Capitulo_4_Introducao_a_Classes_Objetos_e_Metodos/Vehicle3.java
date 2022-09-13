package Capitulo_4_Introducao_a_Classes_Objetos_e_Metodos;

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
