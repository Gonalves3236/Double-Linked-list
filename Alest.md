#### Algoritmos que tem que fazer

* 12. int[] subList(int fromIndex, int toIndex): retorna um arranjo com os elementos
da lista original entre fromIndex (inclusivo) e toIndex (exclusivo). Ex: 10, 20,
30, 40 à subList(0, 3) à 10, 20, 30

* 13. void sort(): ordena a lista do maior para o menor elemento. Ex: 4, 7, 1, 9 à
9, 7, 4, 1.

* 14. void reverse(): inverte o conteúdo da lista. Ex: 2,3,4,1 à 1, 4, 3,2

* 15. int contaOcorrencias(int element): conta o número de ocorrências do
elemento passado como parâmetro na lista, retornando este valor. Ex: 5, 7, 5,
2, 5 à contaOcorrencias(5) → retorna 3.

* 16. boolean removeImpares(): remove todos os elementos ímpares da lista,
mantendo apenas os pares; retorna true se conseguiu remover e falso caso
contrário. Ex.: 2, 5, 8, 7, 10
à 2, 8, 10.

* III. Análise de Complexidade – Com base nas implementações
desenvolvidas.
* A) Montar uma tabela com duas colunas indicando: (i) O(f(n)) de todos os
métodos descritos acima e (ii) respectivo tempo de execução em microssegundos
para uma lista de tamanho 5000. Observe o exemplo abaixo.