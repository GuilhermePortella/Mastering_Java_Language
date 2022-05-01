/*
 * Usando o try-with-resorce
 */
package Capitulo__10;

import java.io.*;

/**
 *
 * @author Guilherme
 */
public class ShowFile {

    public static void main(String[] args){
        int i;
        
        // confirma se um nome de arquivo foi especificado
        if(args.length != 1){
            System.out.println("Usage: ShowFile filename");
            return;
        }
        //o codigo a seguir usa try with resource para abri o arquivo
        //e fecha automaticamente quando o bloco try e deixado
        try(FileInputStream fin = new FileInputStream(args[0])){
            do{
                i = fin.read();
                if(i != -1)
                    System.out.print((char) i);
            } while (i != -1);
        } catch(IOException exc){
            System.out.println("I/O Error: " + exc);
        }
    }
}