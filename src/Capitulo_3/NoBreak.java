package Capitulo_3;
/**
 *
 * @author Guilherme
 */
public class NoBreak {
    //Demonstração de Switch sem o BREAK
    public static void main(String[] args) {
        int i;
        
        for(i=0; i<=5; i++){
            switch(i){
                case 0:
                    System.out.println("I is less than one");
                case 1:
                    System.out.println("I is less than two");
                case 2:
                    System.out.println("I is less than three");
                case 3:
                    System.out.println("I is less than four");
                case 4:
                    System.out.println("I is less than five");
            }
            System.out.println();
        }
    }
}
/*
Como não temos o Break o programa execulta todas as instruções
apartir do valor do tete;
*/