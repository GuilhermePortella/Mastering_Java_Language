package books.schildt.Capitulo_11_Programacao_com_Varias_Threads;

/**
 *
 * @author Guilherme
 */
public class MyThread2 extends Thread {

    public MyThread2(String name) {
        super(name);
        start();
    }

    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName() + ", count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(getName() + " interrupted");
        }

        System.out.println(getName() + " terminating.");
    }
}

class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyThread2 mt = new MyThread2("Child #1");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interruptade.");
            }
        }
        System.out.println("Main thread ending.");
    }
}
