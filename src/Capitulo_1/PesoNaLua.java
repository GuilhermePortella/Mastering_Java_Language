package Capitulo_1;
/**
 *
 * @author Guilherme
 */

//Exercicio Cap1 - Calcule o peso que voce teria na lua
public class PesoNaLua {
    public static void main(String args[]){
    double PesoTerra;//contem o peso
    double pesoLua;//contem a conversao o peso na lua
    
    PesoTerra = 50;//Digite o seu peso
    
    pesoLua = PesoTerra * 0.17;//converte o peso da terra para o peso na lua
    
    System.out.println(PesoTerra + " é seu peso na terra, e " + pesoLua + " é seu peso na lua.");
    }
}