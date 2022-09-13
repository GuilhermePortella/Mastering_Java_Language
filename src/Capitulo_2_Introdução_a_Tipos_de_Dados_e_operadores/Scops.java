package Capitulo_2_Introdução_a_Tipos_de_Dados_e_operadores;
/**
 *
 * @author Guilherme
 * 
 * Demonstra os operadores de curto-circuito.
 */
public class Scops {
    public static void main(String args[]){
        int n, d, q;
        
        n = 10;
        d = 2;
        if(d != 0 &&(n % d)==0)
            System.out.println(d + " is a factor of " + n);
        
        d = 0;//configura d com zero
        //Ja que d é igual a zero , o segundo operando não é avaliado
        if(d != 0 && (n % d) == 0) // o operador de curto-circuito impede uma divisao por zero
            System.out.println(d + " is a factor of " + n);
        
        /*
        Tente a mesma coisa sem o operador de curto-circuito
        isso causara um erro de divisao por zero
        */
        if(d != 0 & (n % d) == 0) // Agora as duas expressões são avaliadas, permitindo que ocorra uma divisão por zero
            System.out.println(d + " is a factor of " + n);
    }
}