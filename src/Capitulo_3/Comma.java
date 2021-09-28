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
public class Comma {

    //USE VIRGULAS EM UMA INSTRUÇÃO FOR
    public static void main(String[] args) {

        int i, x;

        for (i = 0, x = 10; i < x; i++, x--) {       //Duas variaveis  de controle no laço
            System.out.println("i and j: " + i + " - " + x);

        }
    }
}
