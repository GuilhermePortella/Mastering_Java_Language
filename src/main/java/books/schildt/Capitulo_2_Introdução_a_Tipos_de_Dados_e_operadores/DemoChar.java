package books.schildt.Capitulo_2_Introdução_a_Tipos_de_Dados_e_operadores;
/**
 *
 * @author Guilherme
 * 
 * Variaveis de caracteres podem ser tratadas como inteiros
 */
public class DemoChar {
    public static void main(String args[]){
        char ch;
        ch = 'x';
        System.out.println("ch contains " + ch);
        
        ch++; //incrementa ch   --- Um char pode ser incrementado
        System.out.println("ch is now " + ch);
        
        ch = 90; // dá a ch o valor Z    ---Um char pode receber um valor inteiro.
        System.out.println("ch is now " + ch);
    }
}
