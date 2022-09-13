package Capitulo_3_Instruções_de_Controle_de_Programa;
/**
 *
 * @author Guilherme
 */
public class Guess {
    public static void main(String args[])
            throws java.io.IOException{
        char ch, answer = 'k';
        
        System.out.println("I'm thinkking of a letter between A and Z.");
        System.out.print("Can you guess it: ");
        
        ch = (char) System.in.read(); //Le um char no teclado
        
        if(ch == answer) System.out.println("*** Right ***");
    }
}