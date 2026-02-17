/*
    Imprir caso a pessoa for do sexo masculio e tiver mais de 21 anos de idade
 */
package Algoritmos.Logica;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Pag_141_Al_190 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int i, idade = 0;
        String nome = null, sexo = null;

        for (int j = 0; j < 10; j++) {
            
            System.out.println("Digite um nome: ");
            nome = scr.next();

            System.out.println("Qual e o sexo?  F/M");
            sexo = scr.next();
            
            System.out.println("Digite a idade: ");
            idade = scr.nextInt();
            
            if (sexo.equals("M") || sexo.equals("m") && idade >= 21) {
                System.out.println(nome);
            }
        }

    }

}
