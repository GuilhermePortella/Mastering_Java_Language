package Capitulo_3_Instruções_de_Controle_de_Programa;

/**
 *
 * @author Guilherme
 */
public class DWDemo {

    //Demonstra o laço DO-WHILE    
    public static void main(String[] args)
            throws java.io.IOException {

        char ch;

        do {
            System.out.print("Press a key followed by ENTER: ");
            ch = (char) System.in.read();//obtem um char
        } while (ch != 'q');
    }
}
