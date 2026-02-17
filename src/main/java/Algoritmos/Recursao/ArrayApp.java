package Algoritmos.Recursao;

/**
 *
 * @author Guilherme
 */
public class ArrayApp {

    public static void main(String[] args) {

        long[] arr;                 //referencia vetor
        arr = new long[100];        //cria vetor
        int nElems = 0;             //numero de itens
        int j;                      //contador do laço
        long searchKey;             //chave do item a pesquisar

        arr[0] = 77;                //inserir 10 itens
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        nElems = 10;                //agora 10 itens no vetor

        for (j = 0; j < nElems; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");

        searchKey = 66;
        for (j = 0; j < nElems; j++) {
            if (arr[j] == searchKey) {
                break;
            }
        }
        if (j == nElems) {
            System.out.print("Can't find " + searchKey);
        } else {
            System.out.println("Found " + searchKey);
        }

        searchKey = 55;

        for (j = 0; j < nElems; j++) {
            if (arr[j] == searchKey) {
                break;
            }
        }
        for (int k = j; k < nElems; k++) {
            arr[k] = arr[k + 1];
        }
        nElems--;

        for (j = 0; j < nElems; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
    }

}
