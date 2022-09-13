package Capitulo_3_Instruções_de_Controle_de_Programa;
/**
 *
 * @author Guilherme
 */
public class Ladder {
    public static void main(String args[]){
        
        int x;
        
        for(x=0; x<6; x++){
            
            if(x==1)
                System.out.println("X is one");
            
            else if(x==2)
                System.out.println("x is two");
            
            else if(x==3)
                System.out.println("x is three");
            
            else if(x==4)
                System.out.println("x is four");
            
            else
                System.out.println("x is not between 1 and 4"); // isso é uma instrução padrão
        }
    }
}
