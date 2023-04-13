A comissão organizadora de um rallye automobilístico decidiu apurar os resultados da competição através de um processamento eletrônico. Um dos algoritmos necessários para a classificação das equipes concorrentes é o que emite uma listagem geral do desempenho das equipes, atribuiindo pontos segundo determinadas normas. O algoritmo deverá:
- Ler;
    *Os tempos-padrão (em minutos decimais) para as três fases de competição
    *O número de inscrição de cada equipe e os tempos (em minutos decimais) que as mesmas despenderam ao cumprir as três diferentes etapas.*Considere como flag a inscrição de número 9999
- Calcular:
    *Os pontos de cada equipe em cada uma das etapas, seguindo o seguinte critério:
        - Seja β o valor absoluto da diferença entre o tempo-padrão (lido inicialmente) e
o tempo despendido pela equipe numa etapa:
Se β < 3 minutos        ► Atribuir 100 pontos à etapa
Se 3 ≤ β ≤ 5 minutos    ► Atribuir 80 pontos à etapa
Se β > 5 minutos        ► Atribuir 80 - β−5/5 pontos à etapa

    *O total de pontos de cada equipe nas três etapas
    *A equipe vencedora
- Escrever
    *Para cada equipe, o número de inscrição, os pontos obtidos em cada etapa e o total de pontos obtidos