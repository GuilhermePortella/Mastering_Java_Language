package Capitulo_2;
/**
 *
 * @author Guilherme
 * 
 * O inesperado em uma promoção
 * 
 */
public class PromDemo {
    public static void main(String args[]){
        byte b;
        int i;
        
        b = 10;
        i = b * b;//Não é necessaria a coerção porque o resultado ja é elevado a int --- 
        
        b = 10;
        b = (byte) (b*b); //coerção necessaria
        
        System.out.println("i and b: "+ i + " "+ b);
    }
}
