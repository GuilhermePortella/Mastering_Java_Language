package Capitulo_3_Instruções_de_Controle_de_Programa;
/**
 *
 * @author Guilherme
 */
public class Empty3 {
    //O corpo de um laço pode estar vario
    public static void main(String[] args) {
        int i;
        int sum = 0;
        
        //soma numeros até 5.
        for(i = 1; i <= 5; sum += i++);//não tem corpo nesse laço.
        
        System.out.println("Sum is " + sum);
    }
}
