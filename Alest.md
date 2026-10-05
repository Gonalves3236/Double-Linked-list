#### Algoritmos que tem que fazer

* 1. boolean contains(int element): retorna true se a lista contém o elemento e
falso caso contrário. Ex: 4, 8, 12 à contains(8) à true; contains(5) à
false.

* 4. int indexOf(int element): retorna a posição da primeira ocorrência onde o
elemento está na lista. Ex: 10, 20, 30, 20 à indexOf(20) à1

* 5. void clear(): limpa a lista
  
* 6. void add(int index, int element): insere um elemento na lista na posição
indicada por index. Ex: 3, 7, 9 à add(1, 5) à 3, 5, 7, 9.

* 7. int get(int index): retorna o elemento da posição indicada por index. Ex: 8,
12, 20, 25 à get(2) à 20.

* 8. int set(index, e): substitui o valor na posição index pelo elemento passado
por parâmetro e retorna o valor antigo. Ex: 5, 10, 15, 20 à set(1, 50) à 10;
Lista Final à 5, 50, 15, 20.

* 9. boolean remove(Integer element): remove a primeira ocorrência do
elemento passado por parâmetro e retorna true se conseguiu remover e false
caso contrário. Ex: 10, 20, 30, 20, 40 à remove(20) à true; Lista Final à
10, 30, 20, 40.

* 10. int removeByIndex (int index): remove o elemento da posição index. Ex: 10,
20, 30, 40 àremoveByIndex(2) à 30; Lista Final à10, 20, 40.

* 11. boolean removeAll(int element): remove todas as ocorrências do elemento
passado por parâmetro e retorna true se conseguiu remover e falso caso
contrário.

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