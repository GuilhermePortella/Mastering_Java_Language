package Algoritmos;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Pag_145_Al_200 {

    public static void main(String[] args) {
        
        int ini, f, num, i;
        Scanner scr = new Scanner(System.in);
        
        System.out.print("Digite um valor inicial: ");
        ini = scr.nextInt();
        System.out.print("Digite valor final de um intervalo: ");
        f = scr.nextInt();
        System.out.print("Digite o numero qual se procura os multiplos: ");
        num = scr.nextInt();

        if (ini % num == 0) {
            ini = ini + num;
        }else{
            ini = ini + (num-(ini%num));
        }
        f--;
        for (i = ini; i <= f; i= i + num) {
            System.out.print( i + "     ");            
        }
    }
}
