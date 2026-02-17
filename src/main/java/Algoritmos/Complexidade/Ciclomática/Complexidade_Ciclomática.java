package Algoritmos.Complexidade.Ciclomática;

/**
 *
 * @author Guilherme
 */
public class Complexidade_Ciclomática {

    String texto = "Ola Mundo";

    public static void main(String[] args) {

        Complexidade_Ciclomática exemplo = new Complexidade_Ciclomática();

        exemplo.cyclomatic();
    }

    public void cyclomatic() {
        if (texto == null) {
            olaMundoA();
        } else {
            if (texto.equals("Ola mundos")) {
                olaMundoB();
            } else {
                if (texto.equals(texto.getBytes())) {
                    olaMundoC();
                } else {
                    if (texto != null) {
                        olaMundoD();
                    } else {
                        System.out.println("Ola mundo else");
                    }
                }
            }
        }
    }

    public void olaMundoA() {
        System.out.println("Ola Mundo A");
    }

    public void olaMundoB() {
        System.out.println("Ola Mundo B");
    }

    public void olaMundoC() {
        System.out.println("Ola Mundo C");
    }

    public void olaMundoD() {
        System.out.println("Ola Mundo D");
    }
}
