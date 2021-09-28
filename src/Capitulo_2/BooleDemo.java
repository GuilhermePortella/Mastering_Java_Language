package Capitulo_2;

/**
 *
 * @author Guilherme
 */
public class BooleDemo {
    public static void main(String args[]){
        boolean b;
        
        b = false;
        System.out.println("b is "+ b);
        b = true;
        System.out.println("b is "+ b);
        // um valor booleano pode controlar a instrução if
        if (b) System.out.println("This is execulted.");
        b = false;
        if(b) System.out.println("This is not execulted.");
        
        //O resultado de um operador relacional é um valor booleano
        System.out.println("10 > 9 is "+ (10 > 9));
    }
}
