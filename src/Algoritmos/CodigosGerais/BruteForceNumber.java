package Algoritmos.CodigosGerais;

import java.util.Random;

/**
 *
 * @author Guilherme
 */
public class BruteForceNumber {
    public static void main(String[] args) {
        int arr[] = new int[10];
        
        for (int i = 0; i < arr.length; i++) {
             Random gerador = new Random();
             
            arr[i] = gerador.nextInt();
            
        }
        
        
        encontreNumeroPositivoNoArray(arr);
    }

    public static int encontreNumeroPositivoNoArray(int[] arr) {

        int i = 1;

        while (true) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {

                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
            i++;
        }

    }

}
