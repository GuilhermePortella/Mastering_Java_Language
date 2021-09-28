/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_3;

/**
 *
 * @author Guilherme
 */
public class Help2 {

    /*
    Tente Isto 3-2
    
    Um sistema de ajuda melhorado que usa do-while
    para processar uma seleção do menu.
     */
    public static void main(String args[])
            throws java.io.IOException {
        char choice, ignore;

        do {
            System.out.println("Help on: ");
            System.out.println("    1. if");
            System.out.println("    2. switch");
            System.out.println("    3. for");
            System.out.println("    4. while");
            System.out.println("    5. do-while");
            System.out.print("Choose one: ");
            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (choice < '1' | choice > '5');

        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statemente\n");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("    case constant");
                System.out.println("        statement sequence");
                System.out.println("        break;");
                System.out.println("    //...");
                System.out.println("}\n");
                break;
            case '3':
                System.out.println("The for:\n");
                System.out.print("for(init; condition; iteration)");
                System.out.println(" statement;");
                break;
            case '4':
                System.out.println("The while:\n");
                System.out.println("while(condition) statement;");
                break;
            case '5':
                System.out.println("The do-while:\n");
                System.out.println("do{");
                System.out.println("  statement;");
                System.out.println("} while(condition);");
                break;
        }
    }
}
