package books.schildt.Capitulo_3_Instruções_de_Controle_de_Programa;

/**
 *
 * @author Guilherme
 */
public class BreakErr {

    // Este programa contem um erro
    public static void main(String[] args) {

        one: for (int i = 0; i < 3; i++) {
            System.out.println("Pass " + i + ": ");
        }
        for (int j = 0; j < 100; j++) {
            if (j == 10) {
                // break one;//ERRADO
            }
            System.out.println(j + " ");
        }
    }

}
