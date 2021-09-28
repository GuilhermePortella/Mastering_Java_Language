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
public class SqrRoot {
    //Exibe as raizes quadradas de 1 a 99 e o erro de arredondamento.
    public static void main(String args[]){
        double num, sroot, rerr;
        
        for(num = 1.0; num < 100.0; num++){
            sroot = Math.sqrt(num);
            System.out.println("Square root of " + num + " is " + sroot);
            
            //calcula o erro de arredondamento 
            rerr = num - (sroot * sroot);
            System.out.println("Rounding error is " + rerr);
            System.out.println();
        }
    }
}
