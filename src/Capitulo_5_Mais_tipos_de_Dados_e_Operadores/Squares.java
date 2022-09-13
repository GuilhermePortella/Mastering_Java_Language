package Capitulo_5_Mais_tipos_de_Dados_e_Operadores;

/**
 *
 * @author Guilherme
 */
public class Squares {
    
    public static void main(String[] args) {
        
        int multidim [][][] = new int[4][10][3];
        int multidim4 [][][][] = new int[4][10][3][1];
        int multidim7 [][][][][][][] = new int[4][10][3][10][9][8][1];
        
        int sqrs[][] = {
            { 1, 1 },
            { 2, 4 },
            { 3, 9 },
            { 4, 16 },
            { 5, 25 },
            { 6, 36 },
            { 7, 49 },
            { 8, 64 },
            { 9, 81 },
            { 10, 100 },
        };
        int i, j;
        
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 2; j++)
                System.out.print(sqrs[i][j] + " ");
            System.out.println();
        }
    }
}