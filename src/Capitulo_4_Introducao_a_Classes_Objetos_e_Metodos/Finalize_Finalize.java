package Capitulo_4_Introducao_a_Classes_Objetos_e_Metodos;

/**
 *
 * @author Guilherme
 */
public class Finalize_Finalize {
    
    public static void main(String[] args) {
        
        int count;
        
        Finalize_FDemo ob = new Finalize_FDemo(0);
        
        for (count = 0; count < 499800; count++) {
            ob.generator(count);
            
        }
        //System.gc();
    }
    
}
