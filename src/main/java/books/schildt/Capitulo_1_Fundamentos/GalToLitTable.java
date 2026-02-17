package books.schildt.Capitulo_1_Fundamentos;
/**
 *
 * @author Guilherme
 * 
 * Este programa exibe uma tabela de conversões de galões em litros.
 */
public class GalToLitTable {
    public static void main(String args[]){
        double gallons, liters;
        int count;
        
        count = 0; // inicia o contador de linha em 0.
        for(gallons =1; gallons <= 100; gallons++ ){
            liters = gallons * 3.7854; //converte para litros
            System.out.println(gallons + " gallons is " +
                                liters + "liters");
            count ++;   //incrementa o contador de linhas a cada iteração do loop.
            // a cada decima linha, exibe uma linha em branco
            if(count ==10){ // se o valor do contador for 10 exibe uma linha em branco.
                System.out.println();
                count = 0; // zera o contador de linhas
            }
        }
    }
}
