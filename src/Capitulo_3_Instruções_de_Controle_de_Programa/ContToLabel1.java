package Capitulo_3_Instruções_de_Controle_de_Programa;

/**
 *
 * @author Guilherme
 */
public class ContToLabel1 {

    //Usa continue com um rotulo.
    public static void main(String[] args) {

        outerloop:
        for (int i = 1; i < 10; i++) {
            System.out.print("\nOuter loop pass " + i + ", Inner loop: ");
            for (int j = 1; j < 10; j++) {
                if (j == 5) {
                    continue outerloop; //laço externo de continue.
                }
                System.out.print(j);

            }
        }
    }
}
