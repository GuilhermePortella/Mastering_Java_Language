package Capitulo_3;

/**
 *
 * @author Guilherme
 */

public class BreakDemo {

    //Usando um break para sair de um laço
    public static void main(String[] args) {

        int num;
        num = 100;

        //execulta o laço enquanto i ao quadrado é menor do que num
        for (int i = 0; i < num; i++) {
            if (i * i >= num) {
                break; //encera o laço se i*i >=100
            }
            System.out.print(i + " ");
        }

        System.out.println("Loop complete. ");
    }
}
