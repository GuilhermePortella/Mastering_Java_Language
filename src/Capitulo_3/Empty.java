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

public class Empty {

    //Partes do for podem estar vazias
    public static void main(String args[]){

        int i;
        
        for(i=0; i<11;){ //a expressão de iteração esta faltando
            System.out.println("Pass #" + i);
            i ++; // incrementa a variavel de controle de laço 

        }
    }
    
}
