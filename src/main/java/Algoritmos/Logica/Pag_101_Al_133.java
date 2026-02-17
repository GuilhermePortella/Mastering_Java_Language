package Algoritmos.Logica;

import java.util.Scanner;

public class Pag_101_Al_133 {

    public static void main(String[] args) {
        String sexo;
        double h, peso;

        Scanner scr = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        h = scr.nextDouble();
        System.out.print("Qual seu sexo? M/F ");
        sexo = scr.next();
        if (sexo == "m" || sexo == "M") {
            peso = (72.7 * h) - 58;
        } else {
            peso = (62.1 * h) - 44.7;
        }
        System.out.print("Seu pese ideal e: " + peso);

        scr.close();
    }

}
