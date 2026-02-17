package books.schildt.Capitulo_2_Introdução_a_Tipos_de_Dados_e_operadores;

/**
 *
 * @author Guilherme
 * 
 *         Os efeitos colaterais podem ser importantes
 */
public class SideEffects {
    public static void main(String args[]) {
        int i;
        boolean b = false;

        i = 0;

        /*
         * Aqui, i é incrementada mesmo que a
         * instrução if seja falsa
         */
        if (b & (++i < 100))
            System.out.println("This won't be displayed");
        System.out.println("if statement executed: " + i);// exibe 1

        /*
         * Nesse caso, i não é incrementada porque o
         * operador de curto-circuito ingnora o incremento
         */
        if (b && (i++ < 100))
            System.out.println("This won't be displayed");
        System.out.println("if statement executed: " + i);// continua
    }
}
