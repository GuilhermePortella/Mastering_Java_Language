package Capitulo_1;
/**
 *
 * @author Guilherme
 */
public class IfDemo {
    public static void main(String args[]){
        int a, b, c;
        
        a = 2;
        b = 3;
        
        if(a < b) System.out.println("A is less than b");
        //não exibe nada
        
        if(a == b) System.out.println("You won's see this");
        
        System.out.println();
        
        c = a - b; //C contem -1
        
        System.out.println("C contains - 1");
        if(c >= 0) System.out.println("C is non-negative");
        if(c < 0) System.out.println("C is negative");
        
        System.out.println();
        
        c = b - a;//agora C contem 1 
        
        System.out.println("C contains 1");
        if(c >= 0) System.out.println("C is non-negative");
        if(c <0) System.out.println("C is negative");
    }
}
