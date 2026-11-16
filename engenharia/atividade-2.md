# Atividade 2 — Comentário sobre o trecho 2

**Trecho (resumo):** "Programming Over Time". O texto propõe que engenharia de software inclui não só escrever código, mas todas as ferramentas e processos que uma organização usa para construir e manter esse código ao longo do tempo. A ideia-chave é que engenharia de software pode ser vista como "programação integrada ao tempo". O livro destaca princípios como Tempo e Mudança (como o código precisará se adaptar ao longo de sua vida).

## Comentário

Para mim, a ideia mais importante do trecho é que o código tem ciclo de vida: concepção, introdução, manutenção e descontinuação. Escrever algo que funciona hoje é fácil. O difícil é manter esse código valioso e sustentável por anos, reagindo a mudanças necessárias sem quebrar tudo.

A expressão "programação integrada ao tempo" resume bem a diferença entre programar e fazer engenharia. Um programa feito para uma aula pode ser descartado depois da entrega. Um sistema real vive muito mais tempo do que o previsto, passa por várias pessoas e precisa mudar quando os requisitos, as bibliotecas e o ambiente mudam. Por isso o princípio "Tempo e Mudança" faz sentido: o código precisa ser escrito pensando em como vai se adaptar durante toda a sua vida.

O texto também admite que não há respostas fundamentais para essas perguntas, só a experiência acumulada do Google ao longo de duas décadas. Achei honesto, porque mostra que a área ainda está amadurecendo.

Um exemplo comum é o sistema de uma biblioteca escolar. Hoje ele usa um banco de dados e uma versão específica de uma biblioteca de terceiros. Em poucos anos o banco será trocado, a biblioteca ficará sem suporte e as regras de empréstimo mudarão. Se o código estiver todo misturado, cada mudança será cara e arriscada. Separar a interface, as regras de negócio e o acesso a dados em camadas, e ter testes automatizados, é uma decisão que pensa no futuro e não só no que funciona agora.
