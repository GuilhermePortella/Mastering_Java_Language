package books.schildt.Capitulo_2_Introdução_a_Tipos_de_Dados_e_operadores;

/**
 *
 * @author Guilherme
 * 
 * Demonstra a conversão automatica de long para doble
 */
public class longToDouble {
    public static void main(String args[]){
        long L;
        double D;
        
        L = 100123285L;
        D = L; //conversão automatica de long para double
        
        System.out.println("L and D: "+ L + ""+ D);
    }
}
