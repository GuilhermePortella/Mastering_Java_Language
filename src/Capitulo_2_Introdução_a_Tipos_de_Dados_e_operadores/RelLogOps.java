package Capitulo_2_Introdução_a_Tipos_de_Dados_e_operadores;
/**
 *
 * @author Guilherme
 * 
 * Demonstra os operadores relacionais e logicos
 */
public class RelLogOps {
    public static void main(String args[]){
        int i, j;
        boolean b1, b2;
        
        i =10;
        j = 11;
        if(i < j)System.out.println("i < j");
        if(i <= j)System.out.println("i <= j");
        if(i != j)System.out.println("i != j");
        if(i == j)System.out.println("This won't execulte");
        if(i >= j)System.out.println("This won't execulte");
        if(i > j)System.out.println("This won't execulte");
        
        b1 = true;
        b2 = false;
        if(b1 & b2)System.out.println("This won't execulte");
        if(!(b1 & b2))System.out.println("!(b1 & b2) is true");
        if(b1 | b2)System.out.println("b1 | b2 is true");
        if(b1 ^ b2)System.out.println("b1 ^ b2 is true");
    }
}
