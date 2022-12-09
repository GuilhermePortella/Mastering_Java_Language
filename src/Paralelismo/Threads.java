public class Threads extends Thread {
    private final String name;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        try {
            for (; ; ) {
                System.out.println(name);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("sleep interrupted");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new MyThread("First Thread");
        Thread t2 = new MyThread("Second Thread");
        t1.start();
        t2.start();
    }
}


First Thread
Second Thread
First Thread
Second Thread
First Thread