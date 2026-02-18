package books.schildt.Capitulo_4_Introducao_a_Classes_Objetos_e_Metodos;

/**
 *
 * @author Guilherme
 */
public class Vehicle2 {

    int passengers;
    int fuelcap;
    int mpg;

    int range() {
        return mpg * fuelcap; // Retorna a autonomia de um determinado veiculo
    }

}
