package Algoritmos.Grafos;

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
        System.out.print(vertexList[v].label);
    }
    
    public void dfs(){//busca em profundidade
        vertexList[0].wasVisited = true;//comeca em 0 -> marca
        displayVertex(0);//exiba
        theStack.push(0);//empilha
        
        while( !theStack.isEmpty() ){ // >vazia
            //obtem um no adjacente ao topo da pilha nao visitado
            int v = getAdjUnvisitedVertex( theStack.peek());
            if (v == -1)//se n houver no
                theStack.pop();//desenpilha
            else{//exintente
                vertexList[v].wasVisited = true;
                displayVertex(v);
                theStack.push(v);
            }
        }
        //a pilha vazia, fim
        for (int j = 0; j < nVerts; j++) {
            vertexList[j].wasVisited = false;//redefine
        }
    }
    
    // reftorna um no adjacente a V nao visitado
    public int getAdjUnvisitedVertex(int v){
        for (int j = 0; j < nVerts; j++)
            if(adjMat[v][j]==1 && vertexList[j].wasVisited==false)
                return j;//retorna um primeiro no
            return -1; // nao ha no
    }
}
