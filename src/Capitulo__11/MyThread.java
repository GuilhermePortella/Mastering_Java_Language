package Capitulo__11;

import java.io.IOException;
import java.nio.CharBuffer;

/**
 *
 * @author Guilherme
 */

//Criar uma Thread implementando Runnable

public class MyThread implements Runnable{ 
    
    String thrdName;
    
    MyThread (String name){
        thrdName = name;
    }
    
    //ponto de entreda da thread
    public void run() {
        System.out.println(thrdName + " starting. ");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrdName + ", count is " + count);
            }
        }catch(InterruptedException exc){
            System.out.println(thrdName + " interrupted.");
        }
        System.out.println(thrdName + " terminating.");
    }
}

class UseThreads{
    
}
