# Atividade 4 — Outro exemplo do Ollama4j

**O que a atividade pede:** escolher, no GitHub de exemplos do Ollama4j (`ollama4j-examples`), outro exemplo além do dado em aula (`ChatExample`), implementar e colocar no repositório `bertoti`.

## Exemplo escolhido: Embeddings (`embed`)

O `ChatExample` conversa com o modelo. O exemplo de **embeddings** faz outra coisa: transforma textos em vetores de números. Frases com sentido parecido geram vetores parecidos, e isso se mede com a *similaridade do cosseno*.

Código: [`atividade-4/src/main/java/exemplo/EmbeddingsExample.java`](atividade-4/src/main/java/exemplo/EmbeddingsExample.java)

## O que o código faz
1. Conecta ao Ollama local (`http://localhost:11434`).
2. Envia 3 frases ao modelo `nomic-embed-text`: duas sobre um gato descansando em casa (com palavras diferentes) e uma sobre bolsa de valores.
3. Recebe um vetor por frase e calcula o cosseno entre elas.
4. Resultado esperado: frases 1 e 2 com similaridade alta, frases 1 e 3 bem menor.

## Como rodar
```
ollama pull nomic-embed-text
cd atividade-4
mvn compile exec:java -Dexec.mainClass=exemplo.EmbeddingsExample
```
(ou executar a classe pelo IntelliJ).

## Resultado obtido na execução
```
Dimensão do vetor: 768
Frase 1 x Frase 2 (parecidas):   0,7832
Frase 1 x Frase 3 (diferentes):  0,5671
```
As duas frases sobre o gato, escritas com palavras diferentes ("gato dorme no sofá" e "felino descansa no sofá"), ficaram mais próximas (0,78) do que a frase sobre bolsa de valores (0,57). O modelo captura o significado e não só as palavras iguais. O aviso `SLF4J: No providers were found` é só do sistema de logs e não afeta o resultado.

## Por que escolhi este exemplo
O chat é o uso mais conhecido de um modelo de linguagem; embeddings mostram outro: representar o significado de um texto como números. É a base de buscas por sentido, recomendação e agrupamento de textos. O exemplo roda local, sem depender de serviço externo.

## Observação
A API do Ollama4j muda entre versões. Se o `embed(...)` não compilar, ajuste a versão no `pom.xml` para a mesma do ChatExample da aula.
