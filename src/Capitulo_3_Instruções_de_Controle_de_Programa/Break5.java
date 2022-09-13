package Capitulo_3_Instruções_de_Controle_de_Programa;

/**
 *
 * @author Guilherme
 */
public class Break5 {

    //Outro exemplo do uso de break com um rotulo
    public static void main(String[] args) {

        done:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(k + " ");
                    if (k == 5) {
                        break done;// desvia para done
                    }
                }
                System.out.println("After k loop");// nâo sera executado
            }
            System.out.println("after j loop");// nâo sera executado
        }
        System.out.println("after i loop");
    }
}
