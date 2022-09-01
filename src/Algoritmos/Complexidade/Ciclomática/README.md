# Complexidade Ciclomática

Entre os principais atributos da qualidade de Software baseado em componentes é a complexidade gerada por suas interações. A Complexidade Ciclomática de um código é independente do tamanho físico do componente, dependendo principalmente da estrutura de decisão presente no código. Para calcular a complexidade geral de um sistema baseado em componentes é necessário incluir as propriedades de acoplamento (interações-inter componentes) entre seus componentes, e também as propriedades coesivas (interações-intra componentes) sendo dos componentes individuais.

A complexidade ciclomática é uma medida reconhecida de um aspecto da complexidade estrutural.
A orientação original para calcular a métrica de complexidade ciclomática de McCabe (M) discute arestas (E), nós (N) e componentes conectados (P), dando-nos a seguinte fórmula:

M = E - N + 2P
Caso o programa ter múltiplos pontos de retorno a fórmula é modificada para:
M = E - N + 1 + R, onde R é o número de retorno do programa

Mas pode ser computada de outras duas formas.

