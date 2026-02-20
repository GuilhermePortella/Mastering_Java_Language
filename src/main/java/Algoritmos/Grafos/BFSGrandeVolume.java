package Algoritmos.Grafos;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

/**
 * BFS (Busca em Largura) com Lista de Adjacência — Alto Volume de Dados
 *
 * Diferenças em relação ao exemplo DFS existente (Graph.java):
 * - Usa LISTA DE ADJACÊNCIA (ArrayList) em vez de matriz de adjacência,
 * muito mais eficiente em memória para grafos grandes e esparsos.
 * - Usa uma FILA (Queue/ArrayDeque) em vez de pilha — característica do BFS.
 * - Gera automaticamente um grafo aleatório grande para estressar o algoritmo.
 *
 * Complexidade:
 * - Tempo : O(V + E) — visita cada vértice e aresta uma vez
 * - Memória: O(V + E) — lista de adjacência proporcional ao número de arestas
 *
 * @author Guilherme
 */
public class BFSGrandeVolume {

    // -------------------------------------------------------------------------
    // Representação do grafo por lista de adjacência
    // -------------------------------------------------------------------------
    private final int totalVertices;
    private final List<List<Integer>> adj; // adj.get(v) = vizinhos de v

    public BFSGrandeVolume(int totalVertices) {
        this.totalVertices = totalVertices;
        this.adj = new ArrayList<>(totalVertices);
        for (int i = 0; i < totalVertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    /** Adiciona aresta não-direcionada entre u e v */
    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // -------------------------------------------------------------------------
    // BFS — retorna a quantidade de vértices alcançáveis a partir de 'inicio'
    // -------------------------------------------------------------------------
    public int bfs(int inicio) {
        boolean[] visitado = new boolean[totalVertices];
        Queue<Integer> fila = new ArrayDeque<>();

        visitado[inicio] = true;
        fila.offer(inicio);
        int contadorVisitados = 0;

        while (!fila.isEmpty()) {
            int atual = fila.poll();
            contadorVisitados++;

            for (int vizinho : adj.get(atual)) {
                if (!visitado[vizinho]) {
                    visitado[vizinho] = true;
                    fila.offer(vizinho);
                }
            }
        }
        return contadorVisitados;
    }

    // -------------------------------------------------------------------------
    // Ponto de entrada — gera grafo grande e mede o tempo de execução
    // -------------------------------------------------------------------------
    public static void main(String[] args) {

        final int NUM_VERTICES = 10_000; // 10 mil vértices
        final int NUM_ARESTAS = 50_000; // 50 mil arestas aleatórias

        System.out.println("=== BFS com Alto Volume de Dados ===");
        System.out.printf("Gerando grafo com %,d vertices e %,d arestas...%n",
                NUM_VERTICES, NUM_ARESTAS);

        // --- Geração do grafo ------------------------------------------------
        long inicio = System.currentTimeMillis();

        BFSGrandeVolume grafo = new BFSGrandeVolume(NUM_VERTICES);
        Random rnd = new Random(42); // semente fixa para reprodutibilidade

        // Garante conectividade básica: cadeia linear 0-1-2-...-N-1
        for (int i = 0; i < NUM_VERTICES - 1; i++) {
            grafo.addEdge(i, i + 1);
        }

        // Arestas aleatórias extras
        int arestasExtras = NUM_ARESTAS - (NUM_VERTICES - 1);
        for (int i = 0; i < arestasExtras; i++) {
            int u = rnd.nextInt(NUM_VERTICES);
            int v = rnd.nextInt(NUM_VERTICES);
            if (u != v) {
                grafo.addEdge(u, v);
            }
        }

        long fimGeracao = System.currentTimeMillis();
        System.out.printf("Grafo gerado em %d ms.%n", fimGeracao - inicio);

        // --- Execução do BFS -------------------------------------------------
        System.out.println("\nIniciando BFS a partir do vertice 0...");
        long inicioBFS = System.currentTimeMillis();

        int visitados = grafo.bfs(0);

        long fimBFS = System.currentTimeMillis();

        // --- Resultados ------------------------------------------------------
        System.out.printf("Vertices visitados pelo BFS : %,d / %,d%n",
                visitados, NUM_VERTICES);
        System.out.printf("Tempo de execucão do BFS    : %d ms%n",
                fimBFS - inicioBFS);
        System.out.printf("Tempo total (geracão + BFS) : %d ms%n",
                fimBFS - inicio);

        // --- Por que usar BFS e não DFS para grandes volumes? ----------------
        System.out.println("\n--- Observacoes ---");
        System.out.println("BFS usa uma FILA (FIFO): explora nivel a nivel (camada por camada).");
        System.out.println("DFS usa uma PILHA (LIFO): mergulha fundo antes de voltar.");
        System.out.println("Em grafos densos ou muito profundos, o DFS recursivo pode");
        System.out.println("causar StackOverflowError. O BFS iterativo e mais seguro.");
        System.out.println("A LISTA DE ADJACENCIA usa O(V+E) de memoria, enquanto a");
        System.out.println("MATRIZ DE ADJACENCIA usaria O(V²) — inviavel para 10k vertices");
        System.out.printf("(seriam %,d celulas vs %,d entradas na lista).%n",
                (long) NUM_VERTICES * NUM_VERTICES, NUM_ARESTAS * 2);
    }
}
