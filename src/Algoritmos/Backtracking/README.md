## Backtracking

![](https://i.imgur.com/waxVImv.png)


O código acima é uma implementação em Java do algoritmo de backtracking para resolver jogos de Sudoku. 
O Sudoku é um jogo de lógica em que os jogadores preenchem uma grade 9x9 com números de 1 a 9 de tal forma que cada 
número ocorre exatamente uma vez em cada linha, coluna e cada um dos nove quadrados 3x3 que compõem a grade.

O algoritmo de backtracking é usado para encontrar a solução de problemas com múltiplas possibilidades, 
como o Sudoku, tentando todas as possibilidades e voltando atrás quando uma possibilidade não é viável. 
A classe Sudoku tem dois métodos principais: o método solveSudoku() e o método isSafe().

O método solveSudoku() é responsável por resolver o Sudoku. Ele começa preenchendo a grade com os números fornecidos
e chamando o método isSafe() para verificar se um número é seguro de ser colocado em uma determinada célula. 
Se o método isSafe() retornar falso, o algoritmo volta uma etapa e tenta outro número para a célula. Se todos os 
números forem tentados e nenhum for seguro, o algoritmo volta ainda mais uma etapa e tenta outro número para a célula 
anterior. Esse processo continua até que a grade seja completamente preenchida ou seja determinado que não há solução.
Se a grade for completamente preenchida, a solução foi encontrada e é exibida no console. Caso contrário, é exibida a
mensagem "No solution exists"

O método isSafe() verifica se um número pode ser colocado em uma determinada célula, comparando-o com os números 
nas linhas, colunas e quadrados 3x3 que contêm a célula. Ele usa três matrizes booleanas, rows, cols e squares para 
registrar quais números já foram usados em cada linha, coluna e quadrado 3x3 respectivamente. Se um número já foi 
usado na linha, coluna ou quadrado 3x3, o método isSafe() retorna falso, indicando que o número não é seguro de ser 
colocado na célula. Caso contrário, 
ele retorna verdadeiro.

Além disso, o código tem uma função adicional chamada mark() que marca um número como usado em uma linha, 
coluna e quadrado 3x3, permitindo que o método isSafe() possa verificar se um número já foi usado 
e evitando que ele seja usado novamente. A função mark() é chamada sempre que um número é colocado na grade e 
quando o algoritmo volta uma etapa e tenta outro número para uma célula.

É importante notar que essa implementação do algoritmo de backtracking é uma das muitas formas de se 
resolver um Sudoku, e pode haver outras formas mais eficientes e otimizadas de se resolver o problema.



![](https://i.imgur.com/waxVImv.png)
