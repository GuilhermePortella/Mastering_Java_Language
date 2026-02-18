package books.schildt.Capitulo_3_Instruções_de_Controle_de_Programa;
/**
 *
 * @author Guilherme
 */
public class WhileDemo {
    public static void main(String[] args) {
        char ch;
        
        //Exibe o alfabeto usando um laço while
        ch ='a';
        
        while(ch <= 'z'){
            System.out.println(ch);
            ch++;
        }
    }
}
