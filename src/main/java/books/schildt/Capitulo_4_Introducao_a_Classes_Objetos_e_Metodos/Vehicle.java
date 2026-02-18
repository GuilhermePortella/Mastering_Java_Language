package books.schildt.Capitulo_4_Introducao_a_Classes_Objetos_e_Metodos;

/**
 *
 * @author Guilherme
 */
public class Vehicle {

    int passengers;
    int fuelcap;
    int mpg;

    void ranger() {
        System.out.println("Range is " + fuelcap * mpg);
    }

}
