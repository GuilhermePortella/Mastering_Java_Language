/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_2;
/**
 *
 * @author Guilherme
 */
public class NumPrimos {
    public static void main(String args[]){
        //numeros primos entre 2 e 100
        int i, j; 
        boolean isprime; 
 
        for(i=2; i < 100; i++) { 
            isprime = true;  
 
        // see if the number is evenly divisible 
        for(j=2; j <= i/j; j++) 
            // if it is, then its not prime 
            if((i%j) == 0) isprime = false; 
 
            if(isprime) 
            System.out.println(i + " is prime."); 
    } 
  }
}
