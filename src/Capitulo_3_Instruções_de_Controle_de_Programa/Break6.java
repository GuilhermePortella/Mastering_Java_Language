package Capitulo_3_Instruções_de_Controle_de_Programa;

/**
 *
 * @author Guilherme
 */
public class Break6 {

    //E importante onde o rotulo e inserido
    public static void main(String[] args) {
        int x = 0, y = 0;

        //aqui, insira o rotulo antes da instrução for
        stop1:
        for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {
                if (y == 2) {
                    break stop1;
                }
                System.out.println("x and y: " + x + "" + y);
            }
        }
        System.out.println();

        // agora, insira o rotulo imediatamente antesde {
        for (x = 0; x < 5; x++) {
            stop2:
            {
                for (y = 0; y < 5; y++) {
                    if (y == 2) {
                        break stop2;
                    }
                    System.out.println("x and y: " + x + " " + y);
                }
            }
        }
    }
}
