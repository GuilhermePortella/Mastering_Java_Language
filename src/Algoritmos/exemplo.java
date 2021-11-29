package Algoritmos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Guilherme
 */
public class exemplo {

    public static void main(String[] args) throws IOException {
        
        BufferedWriter br = new BufferedWriter(new FileWriter("file2"));
        
        br.write("Vamos escrever nesse novo arquivo em Java!");
        br.newLine();
        br.newLine();
        br.write("Vamos escrever outra linha");
        br.close();
    }

}
