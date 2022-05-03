package Capitulo_9;

/**
 *
 * @author Guilherme
 */
public class ExcTypeMismatch {
    
    //nao funcionara
    
    public static void main(String[] args) {
        int nums[] = new int[4];
        
        try {
            System.out.println("Before exception is generated.");
            
            //gera uma excecao de indice fora do limite
            nums[7] = 10;
            System.out.println("this won't be displayed.");
        }
        /* nao pode capturar um erro de limite de array
           com uma ArithmeticException*/
        catch(ArithmeticException exc) {
            //captura a excecao
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement");
    }
}
