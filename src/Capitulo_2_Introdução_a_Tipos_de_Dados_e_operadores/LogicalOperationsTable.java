package Capitulo_2_Introdução_a_Tipos_de_Dados_e_operadores;
/**
 *
 * @author Guilherme
 * 
 * Tente isto 2-2: uma tabela-verdade para os operadores lógicos.
 */
public class LogicalOperationsTable {
    public static void main(String args[]){
        boolean p, q;
        
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        
        p = true; q = true;
        System.out.print(p+"\t"+q+"\t");
        System.out.print((p&q)+"\t"+(p|q)+"\t");
        System.out.println((p^q)+"\t"+(!p));
        
        p = true; q = false;
        System.out.print(p+"\t"+q+"\t");
        System.out.print((p&q)+"\t"+(p|q)+"\t");
        System.out.println((p^q)+"\t"+(!p));
        
        p = false; q = true;
        System.out.print(p+"\t"+q+"\t");
        System.out.print((p&q)+"\t"+(p|q)+"\t");
        System.out.println((p^q)+"\t"+(!p));
        
        p = false; q = false;
        System.out.print(p+"\t"+q+"\t");
        System.out.print((p&q)+"\t"+(p|q)+"\t");
        System.out.println((p^q)+"\t"+(!p));
    }
}