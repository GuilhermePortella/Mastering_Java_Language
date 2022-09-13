package Capitulo_2_Introdução_a_Tipos_de_Dados_e_operadores;

/**
 *
 * @author Guilherme
 * Usando uma coerção
 */
public class UseCast {
    public static void main(String args[]){
        int i;
        
        for(i = 0; i < 5; i++){
            System.out.println(i + " / 3: "+ i / 3);
            System.out.println(i + " /3 with fractions: "+ (double)i/3);
            System.out.println();
        }
    }
}
