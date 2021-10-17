package Capitulo_4;

/**
 *
 * @author Guilherme
 */
public class Vehicle2 {

    int passengers;
    int fuelcap;
    int mpg;
    
    int range() {
        return mpg * fuelcap; //Retorna a autonomia de um determinado veiculo
    }

}
