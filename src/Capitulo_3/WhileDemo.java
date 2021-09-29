package Capitulo_3;
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
