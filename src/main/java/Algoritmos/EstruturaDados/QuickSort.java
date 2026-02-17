package Algoritmos.EstruturaDados;

/**
 *
 * @author Guilherme
 */
public class QuickSort {

    public void ordenarVetorDeInteiros(int[] vetor) {
        quickSort(vetor, 0, vetor.length - 1);
    }

    public void quickSort(int[] vetor, int inicio, int fim) {
        if (fim > inicio) {
            int indexPivo = dividir(vetor, inicio, fim);
            quickSort(vetor, inicio, indexPivo - 1);
            quickSort(vetor, indexPivo + 1, fim);
        }
    }

    private int dividir(int[] vetor, int inicio, int fim) {
        int pivo, pontEsq, pontDir = fim;
        pontEsq = inicio + 1;
        pivo = vetor[inicio];

        while (pontEsq <= pontDir) {
            while (pontEsq <= pontDir && vetor[pontEsq] <= pivo) {
                pontEsq++;
            }

            while (pontDir >= pontEsq && vetor[pontDir] > pivo) {
                pontDir--;
            }

            if (pontEsq < pontDir) {
                trocar(vetor, pontDir, pontEsq);
                pontEsq++;
                pontDir--;
            }
        }
        trocar(vetor, inicio, pontDir);
        return pontDir;
    }

    private void trocar(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }
    public static void main(String[] args) {
        int vetor[] = {24, 66, 87, 43, 11, 27, 4, 2, 7, 8, 4, 5,
                       12, 53, 42, 22, 1, 5, 9, 13, 16, 23, 13, 7, 55, 67,
                       92, 22, 33, 27, 19};
    
    QuickSort sort = new QuickSort();
    sort.ordenarVetorDeInteiros(vetor);
    imprimirVetor(vetor);
    }
    private static void imprimirVetor(int[] vetor){
        System.out.println("Vetor ...\n");
        for (int num : vetor) {
            System.out.println(num + ", ");            
        }
    }
}

