package Capitulo_13_Tipos_Genericos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Guilherme
 */
public class CollectionTest {
    
    public static void main(String[] args) {
        // adiciona elementos no array colors a listar
        String[] colors = {"Magenta", "Red", "White", "Blue", "Cyan"};
        List<String> list = new ArrayList<String>();
        
        for(String color:colors)
            list.add(color);
        
        String[] removeColors = {"Red", "White", "Blue"};
        List<String> removeList = new ArrayList<String>();
        
        for(String color: removeColors)
            removeList.add(color);
        
        System.out.println("ArrayList");
        
        for (int count = 0; count < list.size(); count++)
            System.out.printf("%s" , list.get(count));
        
        removeColors(list, removeList);
        
        
        System.out.printf("%n%nArrayList after calling removeColors:%n");
        
        for(String color: list)
            System.out.printf("%s", color);
    }
    
    private static void removeColors(Collection<String> collection1, Collection<String> collection2){
        Iterator<String> iterator = collection1.iterator();
        
        while (iterator.hasNext()) {
            if (collection2.contains(iterator.next())) {
                iterator.remove();
            }
        }
    }
    
}
