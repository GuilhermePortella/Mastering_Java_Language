package books.schildt.Capitulo_2_Introdução_a_Tipos_de_Dados_e_operadores;
/**
 *
 * @author Guilherme
 * 
 * Demonstra a inicialização dinamica.
 */
public class DynInit {
    public void main(String args[]){
        double radius = 4, height = 5;
        
        //inicializa volume dinamicamente
        double volume = 3.1416 * radius * radius * height; //volume é inicializada dinamicamente no tempo de execução
        
        System.out.println("Volume is " + volume);
    }
}
