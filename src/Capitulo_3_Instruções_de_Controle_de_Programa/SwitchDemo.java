package Capitulo_3_Instruções_de_Controle_de_Programa;
/**
 *
 * @author Guilherme
 */
//demonstra Switch
public class SwitchDemo {
    public static void main(String[] args) {
        
        int i;
        
        for(i=0; i<10; i++)
            
            switch(i){
                case 0:
                    System.out.println("I is zero");
                    break;
                
                case 1:
                    System.out.println("I is one");
                    break;
                
                case 2:
                    System.out.println("I is two");
                    break;
                
                case 3:
                    System.out.println("I is trree");
                    break;
                
                case 4:
                    System.out.println("I is four");
                    break;
                default:
                    System.out.println("I is five or more");
        }
    } 
}
