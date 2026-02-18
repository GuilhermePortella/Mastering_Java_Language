package books.schildt.Capitulo_3_Instruções_de_Controle_de_Programa;

/**
 *
 * @author Guilherme
 */
public class Power {
    public static void main(String[] args) {
        int e;
        int result;
        
        for(int i=0; i < 10; i++){
            result = 1;
            e = i;
            while(e > 0){
                result *=2;
                e--;
            }
            System.out.println("2 to the " + i + "Power is " + result);
        }
    }
    
}
