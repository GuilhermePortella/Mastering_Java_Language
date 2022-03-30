package Capitulo__11;

/**
 *
 * @author Guilherme
 */

//Criar uma Thread implementando Runnable

public class MyThread implements Runnable{ 
    
    Thread thrd; //Uma referencia ao objeto  thread e armazenado em thrd
    //String thrdName;
    
    //constroi uma thread 
    MyThread (String name){
        thrd = new Thread(this, name);//a thread e nomeada quando e criada
        //thrdName = name;
        thrd.start(); //inicia a thread
    }
    
    //ponto de entreda da thread
    public void run() {
        System.out.println(thrd.getName() + " starting. ");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + ", count is " + count);
            }
        }catch(InterruptedException exc){
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}

class UseThreadsImproved{
    
    public static void main(String args[]){
        System.out.println("Main thread starting.");
        
        //Primeiro, constroi um objeto MyThread.
        MyThread mt = new MyThread("Child #1"); //Cria um objeto executavel
        
        //Em seguida, constroi uma tread a partir desse objeto
        //Thread newThrd = new Thread(mt); //constroi uma thread nesse objeto
        
        //Para concluir, começa a execução da thread.
        //newThrd.start(); //começa a executar a thread
        
        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
    
}
