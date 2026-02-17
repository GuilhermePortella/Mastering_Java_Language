package books.schildt.Capitulo_2_Introdução_a_Tipos_de_Dados_e_operadores;
/**
 *
 * @author Guilherme
 * 
 * Demonstra o tempo de vida de uma variavel
 */
public class VarInitDemo {
    public static void main(String args[]){
        int x;
        
        for (x = 0; x < 3; x++){
            int y = -1;// y sera inicializada sempre que entrarmos no bloco
            System.out.println("y is now: "+ y); //essa linha sempre exibe -1
            y = 100;
            System.out.println("y is now: "+ y);
        }
    }
}