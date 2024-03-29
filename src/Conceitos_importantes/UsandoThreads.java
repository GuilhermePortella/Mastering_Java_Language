package Conceitos_importantes;

/**
 *
 * @author Guilherme
 */
public class UsandoThreads {

    
    private final long valorInicial;
    private final long valorFinal;
    private long total = 0;

    public UsandoThreads(int valorInicial, int valorFinal) {
        this.valorInicial = valorInicial;
        this.valorFinal = valorFinal;
    }

    public long getTotal() {
        return total;
    }

    public void run() {
        for (long i = valorInicial; i <= valorFinal; i++) {
            total += i;
        }
    }
}
