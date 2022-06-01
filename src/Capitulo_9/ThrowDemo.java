package Capitulo_9;

/**
 *
 * @author Guilherme
 */
public class ThrowDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Before throw.");
            throw new ArithmeticException();
        } catch (ArithmeticException exc) {
            System.out.println("Exception caught.");
        }
        System.out.println("After try/catch block.");
    }    
}
