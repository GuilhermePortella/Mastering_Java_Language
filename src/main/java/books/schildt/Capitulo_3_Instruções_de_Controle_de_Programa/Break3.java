package books.schildt.Capitulo_3_Instruções_de_Controle_de_Programa;

/**
 *
 * @author Guilherme
 */
public class Break3 {

    //Usando break com laços aninhados
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            System.out.println("Outer loop cont: " + i);
            System.out.print("  Inner loop count: ");

            int t = 0;
            while (t < 100) {
                if (t == 11) {
                    break; //encerra o laço se t is 10
                }
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Loops complete. ");
        System.out.println();
    }

}
