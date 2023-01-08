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

    public void olaMundoA() {System.out.println("Ola Mundo A");}
    public void olaMundoB() {System.out.println("Ola Mundo B");}
    public void olaMundoC() {System.out.println("Ola Mundo C");}
    public void olaMundoD() {System.out.println("Ola Mundo D");}
}


public class Complexidade_Ciclomática_2 {
    //o código tem uma complexidade ciclomática de 2, pois há dois caminhos diferentes que o código pode seguir (x é menor que y ou x é maior que y).
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        if (x < y) {
            System.out.println("x is less than y");
        } else if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("x is equal to y");
        }
    }
}
