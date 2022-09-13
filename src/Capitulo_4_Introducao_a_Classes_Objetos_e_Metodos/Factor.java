package Capitulo_4_Introducao_a_Classes_Objetos_e_Metodos;

/**
 *
 * @author Guilherme
 */
public class Factor {
    
    boolean isFactor(int a, int b) {
        
        if ((b%a) == 0) {
            return true;            
        }else
            return false;
    }
    
}
