package Algoritmos.CodigosGerais;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Guilherme
 */
public class EscreverArquivo {

    public static void main(String[] args) throws IOException {

        BufferedWriter br = new BufferedWriter(new FileWriter("Conceitos-Basicos-da-Linguagem-Java"));

        br.write("Java é uma otima linguagem");
        br.newLine();
        br.newLine();
        br.write("Conceitos Basicos da Linguagem Java");
        br.close();
    }

}
