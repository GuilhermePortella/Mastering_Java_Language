/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_3_Instruções_de_Controle_de_Programa;
/**
 *
 * @author Guilherme
 */
public class Empty2 {
    //Retira mais uma parte do laço for
    
    public static void main(String[] args) {
        int i;
        
        i = 0;//move a inicialização para fora do laço
        for(;i<11;){
            System.out.println("pass #" + i);
            i++; //incrementa a variavel de controle de laço 
        }
        
      
        for(;;){
            System.out.println("Infinit");
            break;
        }
    }
    
}
