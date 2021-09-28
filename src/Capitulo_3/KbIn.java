package Capitulo_3;

/**
 *
 * @author Guilherme
 */

//Lê um caractere no teclado
public class KbIn {
    public static void main (String args [])
        throws java.io.IOException{
        
        char ch;
        
        System.out.println("Press a key followed by ENTER: ");
        
        ch = (char) System.in.read(); //Obtém um char --- le o caractere no teclado
        
        System.out.println("Your key is: " + ch);
    }   
}
//O método read() é orientado a byte e que retorna um int
//(existe um read orientado a bloco de bytes também). 
//Quando a execução chega no read a JVM aloca um buffer nativo 
//que começa a coletar pressionamento de teclas. Quando for digitado <Enter>, 
//os dados do buffer nativo são transferidos para a JVM e o primeiro byte 
//digitado é retornado ao usuário e retirado do buffer. Porém se o buffer nativo estiver vazio, o método retorna o int -1.