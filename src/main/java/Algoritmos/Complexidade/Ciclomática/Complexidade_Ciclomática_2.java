package Algoritmos.Complexidade.Ciclomática;

/**
 *
 * @author Guilherme
 */
public class Complexidade_Ciclomática_2 {
    //o código tem uma complexidade ciclomática de 2, 
    //pois há dois caminhos diferentes que o código pode seguir 
    //(x é menor que y ou x é maior que y).
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        if (x < y) {
            System.out.println("x is less than y");
        } else if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("x is equal to y");
        }
    }
}