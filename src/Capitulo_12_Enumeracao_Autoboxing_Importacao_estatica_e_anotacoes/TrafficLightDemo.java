package Capitulo_12_Enumeracao_Autoboxing_Importacao_estatica_e_anotacoes;

/**
 *
 * @author Guilherme
 */
public class TrafficLightDemo {
    
}


enum TrafficLightColor {
    RED, GREEN, YELLOW
}

class TrafficLightSimulador implements Runnable {
    
    private Thread thrd;
    private TrafficLightColor  tlc;
    boolean stop = false;
    boolean changed = false;

    public TrafficLightSimulador(TrafficLightColor init) {
        tlc = init;
        
        thrd = new Thread(this);
        thrd.start();
    }

    public TrafficLightSimulador() {
        tlc = TrafficLightColor.RED;
        
        thrd = new Thread(this);
        thrd.start();
    }
    
    public void run() {
        while (!stop) {
            try {
                switch(tlc){
                    case GREEN:
                        Thread.sleep(10000);
                        break;
                    case YELLOW:
                        Thread.sleep(20000);
                        break;
                    case RED:
                        Thread.sleep(12000);
                        break;
                }
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
            changedColor();
        }
    }
    
    synchronized void changedColor() {
        switch(tlc){
            
        }
    }
    
}