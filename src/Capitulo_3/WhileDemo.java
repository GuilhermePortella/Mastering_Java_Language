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
public class WhileDemo {
    public static void main(String[] args) {
        char ch;
        
        //Exibe o alfabeto usando um laço while
        ch ='a';
        
        while(ch <= 'z'){
            System.out.println(ch);
            ch++;
        }
    }
}
