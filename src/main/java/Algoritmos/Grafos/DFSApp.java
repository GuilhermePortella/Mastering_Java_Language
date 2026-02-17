package Algoritmos.Grafos;

/**
 *
 * @author Guilherme
 */
public class DFSApp {

    public static void main(String[] args) {

        Graph theGraph = new Graph();
        theGraph.addVertex('A'); // 1
        theGraph.addVertex('B'); // 2
        theGraph.addVertex('C'); // 3
        theGraph.addVertex('D'); // 4
        theGraph.addVertex('E'); // 5

        theGraph.addEdge(0, 1); //A B
        theGraph.addEdge(1, 2); //B C
        theGraph.addEdge(0, 3); //A D
        theGraph.addEdge(3, 4); //D E

        System.out.print("Visits: ");
        theGraph.dfs();
        System.out.println();
    }

}
