package Algoritmos.Logica;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Pag_253_Al_340 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int n1, n2, nf, d1, d2, d, D, num1, num2, pinteIra;
        int pfrac, numeradorfracao, denominadorfracao, soma;

        System.out.println("Entre com 1 numerador: ");
        n1 = scr.nextInt();
        System.out.println("Entre com 1 dominador: ");
        d1 = scr.nextInt();

        while (d1 < 0) {
            System.out.println("DENOMINADOR INVALIDO ");
            System.out.println("Entre com 1 dominador: ");
            d1 = scr.nextInt();
        }

        System.out.println("Entre com 2 numerador: ");
        n2 = scr.nextInt();
        System.out.println("Entre com 2 dominador: ");
        d2 = scr.nextInt();

        while (d2 < 0) {
            System.out.println("DENOMINADOR INVALIDO ");
            System.out.println("Entre com 2 dominador: ");
            d1 = scr.nextInt();
        }
        
        if (d1 == d2) {
            numeradorfracao = n1 + n1;
            denominadorfracao = d1;
            soma = d1;
        } else {
            if (d1 < d2) {
                soma = d2;
                d = d1;
                D = d2;
            } else {
                soma = d1;
                d = d2;
                D = d1;
            } 
            while (soma%d != 0) {
                soma = soma + D;
            }
            num1 = (soma/d1)*n1;
            num2 = (soma/d2)*n2;
            numeradorfracao = num1 + num2;
            denominadorfracao = soma;
        }
        System.out.println("A soma das fracoes: " + n1 + " / " + d1 + " e " + n2 + " / " + d2 + "  = " + numeradorfracao + " / " + denominadorfracao);
        nf = Math.abs(numeradorfracao);
        pinteIra = nf / denominadorfracao;
        if (numeradorfracao < 0) {
            pinteIra = pinteIra *(-1);            
        } else if (nf/denominadorfracao == 0) {
            System.out.println("Numero inteiro == " + pinteIra);            
        }else {
            if (nf > denominadorfracao) {
                pfrac = nf/denominadorfracao;
                System.out.println("Numero misto = " + pinteIra + " " + pfrac + "/" + soma);
            }else {
                System.out.println("Fracao propria");
            }
            System.out.println("");
        }
    }
}
