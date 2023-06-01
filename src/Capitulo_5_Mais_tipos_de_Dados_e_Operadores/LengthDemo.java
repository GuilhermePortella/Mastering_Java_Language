package Capitulo_5_Mais_tipos_de_Dados_e_Operadores;

/**
 *
 * @author Guilherme
 */
public class LengthDemo {

    public static void main(String[] args) {

        int list[] = new int[10];
        int nums[] = {1, 2, 3};
        int table[][] = { // uma tabela de tamanho variavel
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        System.out.println("lengt of list is: " + list.length);
        System.out.println("lengt of list is: " + nums.length);
        System.out.println("lengt of table is: " + table.length);
        System.out.println("lengt of table [0]: " + table[0].length);
        System.out.println("lengt of table [1]: " + table[1].length);
        System.out.println("lengt of table [3]: " + table[2].length);
        System.out.println();

        //usa length para inicializar list
        for (int i = 0; i < list.length; i++)
            list[i] = i * i;

        System.out.println("Here is list: ");
        // agora usa length para exibir list
        for (int i = 0; i < list.length; i++) 
            System.out.print(list[i] + " ");
        System.out.println();
    }

}
