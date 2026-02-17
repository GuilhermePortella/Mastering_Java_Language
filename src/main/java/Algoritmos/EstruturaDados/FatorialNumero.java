package Algoritmos.EstruturaDados;

import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class FatorialNumero {

    static int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero maior do que zero"));
        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é " + fatorial(numero));
    }

    public int numero() {

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero maior do que zero"));
        return numero;

    }
}
