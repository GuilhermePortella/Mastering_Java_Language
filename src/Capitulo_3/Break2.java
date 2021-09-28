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
public class Break2 {
    // Lê a entrada até um q ser recebido.

    public static void main(String[] args)
            throws java.io.IOException {
        char ch;

        for (;;) { // For infinito
            ch = (char) System.in.read(); //obtem um char
            if (ch == 'q') {
                break; //encera quando digitado q
            }
        }//não é recomendado fazer isso
        System.out.println("You pressed q! ");
    }

}
