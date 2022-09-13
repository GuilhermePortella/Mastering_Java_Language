package Capitulo_2_Introdução_a_Tipos_de_Dados_e_operadores;
/**
 *
 * @author Guilherme
 * 
 * O inesperado em uma promoção
 * 
 */
public class PromDemo {
    public static void main(String args[]){
        byte b;
        int i;
        
        b = 10;
        i = b * b;//Não é necessaria a coerção porque o resultado ja é elevado a int --- 
        
        b = 10;
        b = (byte) (b*b); //coerção necessaria
        
        System.out.println("i and b: "+ i + " "+ b);
    }
}
