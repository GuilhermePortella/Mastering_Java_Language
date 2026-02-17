README - Complexidade Cognitiva (exemplo)
=======================================

Resumo
-----
Este diretório contém um exemplo simples (em Java) que ilustra, de forma pedagógica,
as etapas de um sistema cognitivo inspirado nos princípios do IBM Cognitive Computing:
percepção, interpretação e tomada de decisão. O objetivo não é implementar um
sistema cognitivo completo, mas demonstrar a arquitetura em camadas e uma métrica
simples que estima a "complexidade cognitiva" contanto passos operacionais.

Como o exemplo mapeia à documentação da IBM
-------------------------------------------
- Percepção: extração de tokens da entrada textual (sensoriamento / pré-processamento).
- Interpretação: comparação dos tokens com uma base de conhecimento reduzida.
- Decisão: seleção de uma ação baseada nas evidências encontradas.

Essas três fases refletem o pipeline de alto nível descrito em materiais sobre
cognitive computing: ingestão de dados, análise/entendimento e resposta/ação.

Métrica de "Complexidade Cognitiva" (aqui)
-----------------------------------------
O programa estima uma pontuação somando "passos" executados pelo agente:

- chamadas de método principais (+1 por etapa)
- normalização e tokenização (+1 por operação, +1 por token)
- iterações e verificações (+1 por iteração, +1 por correspondência de conhecimento)
- ramificações de decisão (+1 por ramo avaliado)

Esta pontuação é intencionalmente simples: serve para demonstrar que sistemas
com mais tokens, mais verificações e mais ramificações exigem maior esforço
cognitivo (em termos de operações que o agente precisa realizar).

Arquivo principal
-----------------
- `src/Algoritmos/Complexidade/Cognitiva/Complexidade_Cognitiva.java`: contém a
  classe `CognitiveAgent` e um `main` com duas demonstrações.

Como compilar e executar
------------------------
1. Do diretório raiz do projeto, compile:

```
javac -d build/classes src/Algoritmos/Complexidade/Cognitiva/Complexidade_Cognitiva.java
```

2. Execute:

```
java -cp build/classes Algoritmos.Complexidade.Cognitiva.Complexidade_Cognitiva
```

Observações
-----------
- Este código é um protótipo educativo. Em sistemas reais de cognitive computing
  usar-se-iam modelos de linguagem, representações de conhecimento, motores de
  inferência e gestão de contexto muito mais avançados.
- Para aprofundar, consulte a documentação da IBM sobre Cognitive Computing:
  https://www.ibm.com/br-pt/think/topics/cognitive-computing
