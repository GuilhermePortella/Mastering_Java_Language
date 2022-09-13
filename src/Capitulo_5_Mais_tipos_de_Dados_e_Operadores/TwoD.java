package Capitulo_5_Mais_tipos_de_Dados_e_Operadores;

/**
 *
 * @author Guilherme
 */
public class TwoD {
    //Array bidimencional
    public static void main(String[] args) {
        int t, i;
        
        int table [][] = new int [3][4];
        
        for (t = 0; t < 3; ++t) {
            for (i = 0; i < 4; ++i) {
                table[t][i] = (t*4)+i+1;
                System.out.print(table[t][i] + " - ");
            }
            System.out.println();
        }
    }
}