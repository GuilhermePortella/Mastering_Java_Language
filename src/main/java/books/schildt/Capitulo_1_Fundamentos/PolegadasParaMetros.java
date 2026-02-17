package books.schildt.Capitulo_1_Fundamentos;

/**
 *
 * @author Guilherme
 */
//Converte Polegadas em metros.
public class PolegadasParaMetros {
    public static void main(String args[]){
        double polegadas, metros;
        int count;
        
        count = 0; // inicia o contador de linha em 0.
        
        for(polegadas =1; polegadas <= 144; polegadas++ ){
            
            metros = polegadas / 39.37; //converte para metros
            System.out.println(polegadas + " polegadas são: " +metros + " metros");
            
            count ++;   //incrementa o contador de linhas a cada iteração do loop.
            
            // a cada décima segunda linha, exibe uma linha em branco
            if(count ==12){ // se o valor do contador for 12 exibe uma linha em branco.
                System.out.println();
                count = 0; // zera o contador de linhas
            }
        }
    }
    
}
