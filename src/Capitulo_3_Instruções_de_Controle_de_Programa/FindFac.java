package Capitulo_3_Instruções_de_Controle_de_Programa;

/**
 *
 * @author Guilherme
 */
public class FindFac {

    /*
    usa laços aninhados para encontrar os factores
    dos numeros de 2 a 100.
     */
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            System.out.print("Factors of " + i + ": ");
            for (int j = 2; j < 100; j++) {
                if ((i % j) == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
