package Algoritmos.Recursao;

/**
 *
 * @author Guilherme
 */
public class BuscaBinariaRecursiva {
    
    public int find(long searchKey) {
        
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;
        
        while (true) {
            curIn = (lowerBound + upperBound)/2;
            if (a[curIn]==searchKey) {
                return curIn;
            }else if(lowerBound > upperBound){
                return nElems;
            }else{
                if(a[curIn]<searchKey){
                    lowerBound = curIn + 1;
                }else {
                    upperBound = curIn - 1;
                }
            }
        }
    }
    
}
