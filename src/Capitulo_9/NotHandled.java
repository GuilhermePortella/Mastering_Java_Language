package Capitulo_9;

/**
 *
 * @author Guilherme
 */
public class NotHandled {
    // deixa a JVM tratar o erro.
    public static void main(String[] args) {
        int nums[] = new int[4];
        
        System.out.println("Before exception is generated.");
        
        //gera uma excecao de indice fora do limite
        nums[7] = 10;
    }
    
}
