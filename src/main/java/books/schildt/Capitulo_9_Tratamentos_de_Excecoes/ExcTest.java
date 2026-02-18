
package books.schildt.Capitulo_9_Tratamentos_de_Excecoes;

/**
 *
 * @author Guilherme
 */
public class ExcTest {
    // gerando uma excecao

    static void genException() {
        int nums[] = new int[4];

        System.out.println("Before exception is generated.");

        // gera uma excecao de indice fora do limite
        nums[7] = 10;
        System.out.println("this won1't be displayed");
    }
}

class ExcDemo2 {
    public static void main(String[] args) {
        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            // captura excecao
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement");
    }
}
