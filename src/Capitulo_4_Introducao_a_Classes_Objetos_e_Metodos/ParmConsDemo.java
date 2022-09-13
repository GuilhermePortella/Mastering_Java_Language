package Capitulo_4_Introducao_a_Classes_Objetos_e_Metodos;

/**
 *
 * @author Guilherme
 */
public class ParmConsDemo {

    public static void main(String[] args) {
        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(88);

        System.out.println(t1.x + " " + t2.x);
    }
}
