package Algoritmos;

/**
 *
 * @author Guilherme
 */
public class Pag_143_Al_195 {

    public static void main(String[] args) {
        int soma, j;
        soma = 0;

        for (j = 26; j < 198; ) {
            j = j++ + (+ 2);
            soma = soma + j;
        }
        System.out.println("Soma 26-198: " + soma);
    }

}
