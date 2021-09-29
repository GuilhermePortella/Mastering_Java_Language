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
