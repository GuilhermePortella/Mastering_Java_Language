package Capitulo_3_Instruções_de_Controle_de_Programa;
/**
 *
 * @author Guilherme
 */
public class SqrRoot {
    //Exibe as raizes quadradas de 1 a 99 e o erro de arredondamento.
    public static void main(String args[]){
        double num, sroot, rerr;
        
        for(num = 1.0; num < 100.0; num++){
            sroot = Math.sqrt(num);
            System.out.println("Square root of " + num + " is " + sroot);
            
            //calcula o erro de arredondamento 
            rerr = num - (sroot * sroot);
            System.out.println("Rounding error is " + rerr);
            System.out.println();
        }
    }
}
