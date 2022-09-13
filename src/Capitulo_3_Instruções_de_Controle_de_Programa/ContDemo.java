package Capitulo_3_Instruções_de_Controle_de_Programa;

/**
 *
 * @author Guilherme
 */
public class ContDemo {

    //Usa continue
    public static void main(String[] args) {
        int i;

        //exibe os numeros pares entre 0 e 100
        for (i = 0; i <= 100; i++) {
            if ((i % 2) != 0) {
                continue; //iterate
            }
            System.out.println(i);
        }
    }

}
