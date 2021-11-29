/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        
        br.write("Vamos escrever nesse novo arquivo em Java! que legal hahaha!!!");
        br.newLine();
        br.newLine();
        br.write("Vamos escrever outra linha aqui embaixo hahaha!!!");
        br.close();
    }

}
