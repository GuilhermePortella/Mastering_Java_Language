package Capitulo_1;
/**
 *
 * @author Guilherme
 * Demostra um bloco de codigo
 */
public class BlocoDemo {
    public static void main(String args[]){
        double i, j, d;
        i = 5;
        j = 10;
        
        // O alvo desta instrução if é um bloco Codigo
        if(i != 0){
        System.out.println("I does not equal zero"); // ---|
        d = j/i;                                     // O alvo de If é este bloco inteiro.
        System.out.println("j / i is " + d);         //----|
    }
    }
}
