# Atividade 3 — Três exemplos de tradeoffs em software

Tradeoff é uma escolha em que ganhar em um aspecto significa perder em outro. Em aula vimos que isso é central na engenharia de software: não existe solução perfeita, existe a solução mais adequada para o contexto.

## 1. Linguagem de programação: Java vs. Python (e a analogia do bolo)

Java é tipado, tem boa estrutura para sistemas grandes e roda na JVM. Python permite escrever mais rápido e tem um ecossistema forte em IA, mas costuma ter menos desempenho e menos verificações em tempo de compilação. Na analogia do bolo da aula, cada camada (hardware, C, Go, JVM, Java, Python) esconde detalhes da camada de baixo. Quanto mais alto o nível, mais produtividade, porém menos controle e desempenho. Não existe "a melhor linguagem", existe a mais adequada ao problema.

## 2. JVM: vantagem ou desvantagem?

A JVM dá portabilidade (o mesmo programa roda em vários sistemas) e gerenciamento automático de memória. Em troca, adiciona uma camada extra que consome memória e tempo de inicialização. Para um sistema web, a portabilidade costuma compensar. Para algo que precisa de desempenho máximo ou de baixo consumo, pode ser desvantagem.

## 3. Banco de dados: SQL (relacional) vs. NoSQL

Um banco relacional (como PostgreSQL ou MySQL) garante consistência, relacionamentos e transações (ACID), o que é ideal para dados como pedidos e pagamentos. Em troca, escalar horizontalmente é mais difícil e o esquema é mais rígido. Um banco NoSQL (como MongoDB) é flexível e escala com facilidade, mas oferece menos garantias de consistência e consultas complexas são mais trabalhosas. Uma loja virtual normalmente prefere SQL para os pedidos; uma rede social pode preferir NoSQL para o volume de postagens.

## Por que poucas empresas dominam isso?

Porque comparar tradeoffs em algo intangível é difícil. Não dá para "ver" ou "medir" facilmente o custo de uma decisão de arquitetura, e o resultado só aparece com o tempo.
