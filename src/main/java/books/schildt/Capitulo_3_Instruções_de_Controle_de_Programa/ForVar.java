package books.schildt.Capitulo_3_Instruções_de_Controle_de_Programa;
/**
 *
 * @author Guilherme
 */
public class ForVar {
    //Declara a variavel de controle de laço dentro de for
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;
        
        //calcula o fatorial dos numeros ate 5 
        for(int i = 1; i <= 5; i++){ //A variavel i é declarada dentro da instrução for
            sum += i; //i é conhecida em todo o laço
            fact *= i; 
        }
        // i não é conhecida aqui
        
        System.out.println("Sum is " + sum);
        System.out.println("Factorial is " + fact);
    }
}
