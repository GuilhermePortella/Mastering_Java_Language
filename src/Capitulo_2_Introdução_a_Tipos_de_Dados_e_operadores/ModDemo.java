package Capitulo_2_Introdução_a_Tipos_de_Dados_e_operadores;
/**
 *
 * @author Guilherme
 * 
 * Demonstra o operador %
 */
public class ModDemo {
    public static void main(String args[]){
        int iresult, irem;
        double dresult, drem;
        
        iresult = 10/3;
        irem = 10%3;
        
        dresult = 10.0/3.0;
        drem = 10.0 % 3.0;
        
        System.out.println("Result and remainder of 10/3: " + iresult + " "+ irem);
        System.out.println("Result and remainder of 10.0/3.0: "+ dresult + " "+drem);
    }
}
