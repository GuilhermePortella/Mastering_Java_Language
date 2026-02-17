package Algoritmos.CodigosGerais;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class BruteForcePassword {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Senha: ");
        String password = scr.nextLine();

        for (char c1 = 'a'; c1 <= 'z'; c1++) {
            for (char c2 = 'a'; c2 <= 'z'; c2++) {
                for (char c3 = 'a'; c3 <= 'z'; c3++) {
                    for (char c4 = 'a'; c4 <= 'z'; c4++) {

                        String guess = "" + c1 + c2 + c3 + c4;
                        if (guess.equals(password)) {
                            System.out.println("Encontrada: " + guess);
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("Nao encontrado");
    }

}
