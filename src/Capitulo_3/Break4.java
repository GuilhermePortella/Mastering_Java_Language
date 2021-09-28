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
public class Break4 {

    //usando um break com rotulo
    public static void main(String[] args) {
        int i;

        for (i = 1; i < 4; i++) {
            one:
            {
                two:
                {
                    three:
                    {

                        System.out.println("\ni is " + i);
                        if (i == 1) {
                            break one; // break com um rotulo
                        }
                        if (i == 2) {
                            break two;
                        }
                        if (i == 3) {
                            break three;
                        }

                        //essa parte nunca sera alcançada
                        System.out.println("won't print");
                    }
                    System.out.println("After block three.");
                }
                System.out.println("After block two");
            }
            System.out.println("After block one");
        }
        System.out.println("After for");
    }
}
