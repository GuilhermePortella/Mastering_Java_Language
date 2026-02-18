package books.schildt.Capitulo_5_Mais_tipos_de_Dados_e_Operadores;

/**
 *
 * @author Guilherme
 */
public class Bubble {

    // demo classificação por bolha
    public static void main(String[] args) {
        int nums[] = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };

        int t;

        // exibe o array original
        System.out.println("Original array is: ");
        for (int i = 0; i < nums.length; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        // Esta é a classificação por bolha
        for (int a = 1; a < nums.length; a++)
            for (int b = nums.length - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) { // se fora de ordem
                    // troca elementos
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }

        // exibe o array classificado
        System.out.println("Sorted array is: ");
        for (int i = 0; i < nums.length; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}
