package Algoritmos.Logica;

/**
 *
 * @author Guilherme
 */
public class ImmutableMutable {

    public static void main(String[] args) {
        System.out.println("Immutable \n.....");
        Immutable();
        System.out.println(".....");
        
        System.out.println("Immutable 2 \n.....");
        Immutable2();
        System.out.println(".....");
        
        System.out.println("Mutable \n.....");
        Mutable();
        System.out.println(".....");
    }

    public static void Immutable() {
        int a = 0;

        while (a < 10) {

            System.out.println(a);
            a += 1;
        }
    }
    
    public static void Immutable2(){
        Integer a = 0;
        Integer b = 0;
        
        a=b;
        b=1;
        
        System.out.println(a);
        
    }
    
    public static void Mutable(){
        Integer a=0;
        
        while(a<10){
            System.out.println(a);
            a+=1;
            
        }
    }
}
