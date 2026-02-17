package books.schildt.Capitulo_2_Introdução_a_Tipos_de_Dados_e_operadores;
/**
 *
 * @author Guilherme
 * 
 * Demonstra o escopo de bloco
 */
public class ScopeDemo {
    public static void main(String args[]){
    int x; //conhecida pelo codigo dentro de main()
    
    x = 10;
    if(x ==10){//inicia novo escopo
        int y = 20;//conhecida apenas  nesse bloco
        //tanto x quanto y são conhecidas aqui.
        System.out.println("x and y: " + x + " "+ y);
        x = y * 2;        
    }
    //y = 100; // resulta em erro pois não é conhecida aqui --- aqui y esta fora de escopo.
    
    //x ainda é conhecida aqui.
    System.out.println("X is "+ x);
    }
}
