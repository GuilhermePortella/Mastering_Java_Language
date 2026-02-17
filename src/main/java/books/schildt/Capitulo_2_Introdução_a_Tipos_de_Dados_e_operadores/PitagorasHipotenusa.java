package books.schildt.Capitulo_2_Introdução_a_Tipos_de_Dados_e_operadores;
/**
 *
 * @author Guilherme
 * 
 * Usa o teorema de Pitágoras
 * para encontrar o comprimento 
 * de hipotenusa  dados os comprimentos 
 * dos dois lados opostos.
 */
public class PitagorasHipotenusa {
    public static void main(String args []){
        double x, y, z;   
        x = 3;
        y = 4;
        
        z = Math.sqrt(x*x + y*y);
        System.out.println("Hipotenuse is "+ z);
    }
}