# Algoritmos em Grafos — BFS com Alto Volume de Dados

## Arquivos desta pasta

| Arquivo | Descrição |
|---|---|
| `Vertex.java` | Modelo de vértice (rótulo + flag de visitado) |
| `StackX.java` | Pilha auxiliar usada pelo DFS |
| `Graph.java` | Grafo com **matriz de adjacência** e algoritmo **DFS** |
| `DFSApp.java` | Exemplo de uso do DFS com 5 vértices |
| `BFSGrandeVolume.java` | Grafo com **lista de adjacência** e algoritmo **BFS** — alto volume |

---

## BFSGrandeVolume.java

### O que é BFS?

**BFS (Breadth-First Search / Busca em Largura)** é um algoritmo de travessia de grafos que explora os vértices **nível a nível** — primeiro todos os vizinhos diretos, depois os vizinhos dos vizinhos, e assim por diante.

Usa uma **fila (FIFO)** como estrutura auxiliar, ao contrário do DFS que usa uma pilha.

```
Grafo de exemplo:        Ordem de visita (BFS a partir de A):
                         A → B → C → D → E
    A ─── B
    |     |
    D     C
    |
    E
```

---

### Estrutura de dados: Lista de Adjacência

Em vez de uma matriz `N×N` (como em `Graph.java`), este exemplo usa uma **lista de adjacência**:

```java
List<List<Integer>> adj;
// adj.get(0) = [1, 3]   → vértice 0 conecta a 1 e 3
// adj.get(1) = [0, 2]   → vértice 1 conecta a 0 e 2
```

**Por quê?** Para 10.000 vértices:

| Estrutura | Memória usada |
|---|---|
| Matriz de adjacência | 10.000 × 10.000 = **100 milhões** de células |
| Lista de adjacência | apenas as arestas existentes ≈ **100 mil** entradas |

A lista é **1.000× mais eficiente** para grafos esparsos.

---

### Como o código funciona (passo a passo)

#### 1. Construção do grafo
```java
BFSGrandeVolume grafo = new BFSGrandeVolume(10_000);

// Garante conectividade: cadeia linear 0-1-2-...-9999
for (int i = 0; i < NUM_VERTICES - 1; i++)
    grafo.addEdge(i, i + 1);

// Arestas aleatórias extras para simular grafo real
for (int i = 0; i < arestasExtras; i++) {
    int u = rnd.nextInt(NUM_VERTICES);
    int v = rnd.nextInt(NUM_VERTICES);
    grafo.addEdge(u, v);
}
```

#### 2. Algoritmo BFS
```java
public int bfs(int inicio) {
    boolean[] visitado = new boolean[totalVertices];
    Queue<Integer> fila = new ArrayDeque<>();

    visitado[inicio] = true;
    fila.offer(inicio);          // 1. Enfileira o início

    while (!fila.isEmpty()) {
        int atual = fila.poll(); // 2. Retira da fila

        for (int vizinho : adj.get(atual)) {
            if (!visitado[vizinho]) {
                visitado[vizinho] = true;
                fila.offer(vizinho); // 3. Enfileira vizinhos não visitados
            }
        }
    }
}
```

---

### Resultado da execução

```
=== BFS com Alto Volume de Dados ===
Gerando grafo com 10.000 vértices e 50.000 arestas...
Grafo gerado em 21 ms.

Iniciando BFS a partir do vértice 0...
Vértices visitados: 10.000 / 10.000
Tempo de execução do BFS: 23 ms
Tempo total (geração + BFS): 44 ms
```

---

### Comparação DFS × BFS

| | DFS (`Graph.java`) | BFS (`BFSGrandeVolume.java`) |
|---|---|---|
| **Estrutura auxiliar** | Pilha (LIFO) | Fila (FIFO) |
| **Ordem de exploração** | Profundidade (mergulha fundo) | Largura (nível a nível) |
| **Armazenamento** | Matriz de adjacência | Lista de adjacência |
| **Memória** | O(V²) | O(V + E) |
| **Limite de vértices** | 20 (hardcoded) | Ilimitado |
| **Risco de StackOverflow** | Sim (versão recursiva) | Não (iterativo) |

---

### Complexidade

| | Complexidade |
|---|---|
| **Tempo** | O(V + E) — visita cada vértice e aresta uma vez |
| **Memória** | O(V + E) — proporcional ao tamanho do grafo |

Onde **V** = número de vértices e **E** = número de arestas.
