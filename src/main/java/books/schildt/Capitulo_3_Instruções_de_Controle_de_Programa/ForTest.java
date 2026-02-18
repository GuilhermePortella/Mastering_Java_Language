package books.schildt.Capitulo_3_Instruções_de_Controle_de_Programa;
/**
 *
 * @author Guilherme
 */
public class ForTest {
    //Exerculta o laço até um S ser digitado
    public static void main(String[] args) 
        throws java.io.IOException {
        
        int i;
        
        System.out.println("Press S to stop. ");
        for(i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Pass # " + i);
    }    
}
