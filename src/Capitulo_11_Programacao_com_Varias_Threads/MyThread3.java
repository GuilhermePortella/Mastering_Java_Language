package Capitulo_11_Programacao_com_Varias_Threads;

/**
 *
 * @author Guilherme
 */
public class MyThread3 implements Runnable{

    Thread thrd;
    
    public MyThread3(String name ) {
        thrd = new Thread(this, name);
        thrd.start();
    }
    
    public void run() {
        System.out.println(thrd.getName()+" starting.");
        try{
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + ", count is " + count);
            }
        }catch (InterruptedException exc){
            System.out.println(thrd.getName() + " interrupted");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}

class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");
        
        MyThread3 mt1 = new MyThread3("Child #1");
        MyThread3 mt2 = new MyThread3("Child #2");
        MyThread3 mt3 = new MyThread3("Child #3");
        
        try{
            mt1.thrd.join();
            System.out.println("Child #1 joined");
            mt2.thrd.join();
            System.out.println("Child #2 joined");
            mt3.thrd.join();
            System.out.println("Child #3 joined");
        }catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread ending.");
    }
}