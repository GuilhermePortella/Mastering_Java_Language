/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_3;

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
