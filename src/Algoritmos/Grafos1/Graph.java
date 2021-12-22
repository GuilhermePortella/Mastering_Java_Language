package Algoritmos.Grafos1;

import java.awt.DisplayMode;

/**
 *
 * @author Guilherme
 */
public class Graph {

    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private StackX theStack;

    public Graph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int j = 0; j < MAX_VERTS; j++) 
            for (int k = 0; k < MAX_VERTS; k++) 
                adjMat[j][k] = 0;
        theStack = new StackX();
    }
    
    public void addVertex(char lab){
        vertexList[nVerts++] = new Vertex(lab);
    }
    
    public void addEdge(int start, int end){
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }
    
    public void displayVertex(int v){
        System.out.println(vertexList[v].label);
    }
    
    public void dfs(){
        vertexList[0].wasVisited = true;
        displayVertex(0);
        theStack.push(0);
        
        while( !theStack.isEmpty() ){
            int v = getAdjUnvisitedVertex( theStack.peek());
            if (v == -1)
                theStack.pop();
            else{
                vertexList[v].wasVisited = true;
                displayVertex(v);
                theStack.push(v);
            }
        }
    }
    public int getAdjUnvisitedVertex(int v){
        for (int j = 0; j < nVerts; j++)
            if(adjMat[v][j]==1 && vertexList[j].wasVisited==false)
                return j;
            return -1;
    }
}
