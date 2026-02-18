package books.schildt.Capitulo_9_Tratamentos_de_Excecoes;

/**
 *
 * @author Guilherme
 */
public class ExcDemo1 {

    public static void main(String[] args) {
        int nums[] = new int[4];

        try {
            System.out.println("Before exception is generated.");

            //Gera uma excecao de indice fora dos limites
            nums[7] = 10;
            System.out.println("this won't be displayed");
        } catch (ArrayIndexOutOfBoundsException exc) {
            //captura a excecao
            System.out.println("Index out-of-bounds !");
        }
        System.out.println("After catch statement.");
    }
}
