package Algoritmos.Complexidade.Cognitiva;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Guilherme
 */
public class Complexidade_Cognitiva {

    /**
     * Pequeno agente que demonstra etapas típicas de um sistema cognitivo
     * (percepção -> interpretação -> decisão) e estima uma "pontuação"
     * simplificada de complexidade cognitiva contando passos operacionais.
     */
    private int stepCount = 0;

    public List<String> perceive(String input) {
        stepCount++;
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9\\s]", " ");
        stepCount++;
        String[] tokens = normalized.trim().isEmpty() ? new String[0] : normalized.trim().split("\\s+");
        stepCount += tokens.length;
        return Arrays.asList(tokens);
    }

    public Map<String, Integer> interpret(List<String> tokens) {
        stepCount++;
        Map<String, Integer> keywords = new HashMap<>();
        Set<String> knowledge = new HashSet<>(Arrays.asList("problema", "dados", "solucao", "erro", "otimizacao"));
        stepCount++;
        for (String t : tokens) {
            stepCount++;
            if (knowledge.contains(t)) {
                stepCount++;
                keywords.put(t, keywords.getOrDefault(t, 0) + 1);
            }
        }
        return keywords;
    }

    public String decide(Map<String, Integer> keywords) {
        stepCount++; // entrar em decisão
        if (keywords.isEmpty()) {
            stepCount++; // ramo: pedir clarificação
            return "ask_clarification";
        }
        stepCount++; // escolher ação
        String best = Collections.max(keywords.entrySet(), Map.Entry.comparingByValue()).getKey();
        stepCount++; // produzir ação
        return "handle_" + best;
    }

    public int getCognitiveComplexity() {
        return stepCount;
    }

    public void reset() {
        stepCount = 0;
    }

    public static void demo(String input) {
        Complexidade_Cognitiva agent = new Complexidade_Cognitiva();
        System.out.println("Input: " + input);
        List<String> tokens = agent.perceive(input);
        System.out.println("Percepcao (tokens): " + tokens);
        Map<String, Integer> keywords = agent.interpret(tokens);
        System.out.println("Interpretacao (keywords): " + keywords);
        String action = agent.decide(keywords);
        System.out.println("Decisao: " + action);
        System.out.println("Pontuacao de Complexidade Cognitiva (estimada): " + agent.getCognitiveComplexity());
    }

    public static void main(String[] args) {
        demo("Tenho um problema com os dados. Preciso de uma solucao de otimizacao.");
        System.out.println();
        demo("Ola, quero ajuda");
    }
}
