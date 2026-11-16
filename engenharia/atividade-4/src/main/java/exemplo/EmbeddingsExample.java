package exemplo;

import io.github.ollama4j.OllamaAPI;


import java.util.List;

/**
 * Atividade 4 - exemplo do Ollama4j: geração de EMBEDDINGS (além do ChatExample dado em aula).
 * Compara a similaridade entre frases: frases com sentido parecido têm vetores parecidos.
 *
 * Pré-requisitos: Ollama aberto e modelo baixado:  ollama pull nomic-embed-text
 */
public class EmbeddingsExample {

    public static void main(String[] args) throws Exception {
        OllamaAPI ollama = new OllamaAPI("http://localhost:11434");
        ollama.setRequestTimeoutSeconds(120);

        List<String> frases = List.of(
                "O gato dorme no sofá da sala",
                "Um felino descansa no sofá de casa",
                "A bolsa de valores fechou em alta hoje");

        io.github.ollama4j.models.embeddings.OllamaEmbedResponseModel resposta = ollama.embed("nomic-embed-text", frases);
        List<List<Double>> v = resposta.getEmbeddings();

        System.out.printf("Dimensão do vetor: %d%n", v.get(0).size());
        System.out.printf("Frase 1 x Frase 2 (parecidas):   %.4f%n", cosseno(v.get(0), v.get(1)));
        System.out.printf("Frase 1 x Frase 3 (diferentes):  %.4f%n", cosseno(v.get(0), v.get(2)));
    }

    /** Similaridade do cosseno: 1 = mesmo sentido, perto de 0 = sem relação. */
    static double cosseno(List<Double> a, List<Double> b) {
        double produto = 0, na = 0, nb = 0;
        for (int i = 0; i < a.size(); i++) {
            produto += a.get(i) * b.get(i);
            na += a.get(i) * a.get(i);
            nb += b.get(i) * b.get(i);
        }
        return produto / (Math.sqrt(na) * Math.sqrt(nb));
    }
}
