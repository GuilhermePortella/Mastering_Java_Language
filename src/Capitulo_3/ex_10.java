/*

    Transformar letras minusculas em maiusculas

 */
package Capitulo_3;

import java.io.IOException;

/**
 *
 * @author Guilherme
 */
public class ex_10 {
    
    public static void main(String[] args) throws IOException {
        char ch;
        int changes = 0;
        
        System.out.println("Enter period to stop.");
        
        do {
            ch = (char) System.in.read();
            if (ch >= 'a' & ch <= 'z') {
                ch -= 32;
                changes++;
                System.out.println(ch);
            }else if (ch >= 'A' & ch <= 'Z') {
                ch += 32;
                changes++;
                System.out.println(ch);
            }
            
        } while (ch != '.');
        System.out.println("case changes: " + changes);
    }
}