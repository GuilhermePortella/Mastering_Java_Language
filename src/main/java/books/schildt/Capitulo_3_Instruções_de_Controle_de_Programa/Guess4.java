package books.schildt.Capitulo_3_Instruções_de_Controle_de_Programa;
/**
 *
 * @author Guilherme
 */
public class Guess4 {
    //Adivinhe a letra do jogo, 4 versao
    public static void main(String[] args)
        throws java.io.IOException{
        
        char ch, ignore, answer = 'K';
        
        do{
            System.out.println("I'm thinking of a letter between A and Z.");
            System.out.print("Can you guess it: ");
            
            //Lê um caractere
            ch = (char) System.in.read();
            
            //Descarta qualquer outro caractere do buffer de entrada
            do{
                ignore = (char) System.in.read();
            }while(ignore != '\n');
            
            if(ch == answer) System.out.println("** Right **");
            else{
                System.out.print("...Sorry, you're ");
                if(ch < answer) System.out.println("too low");
                else System.out.println("too high");
                System.out.println("Try again!\n");
            }
        }while(answer != ch);
    }
    
}
