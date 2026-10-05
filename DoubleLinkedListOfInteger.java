import java.util.NoSuchElementException;
    // TRABALHO DE ALEST.
public class DoubleLinkedListOfInteger {
    // Referencia para o sentinela de inicio da lista encadeada.
    private Node header;
    // Referencia para o sentinela de fim da lista encadeada.
    private Node trailer;
    // Referencia para a posicao corrente.
    private Node current;    
    // Contador do numero de elementos da lista.
    private int count;

     private class Node {
        public Integer element;
        public Node next;
        public Node prev;
        public Node(Integer e) {
            element = e;
            next = null;
            prev = null;
        }
    }
    public DoubleLinkedListOfInteger() {
        header = new Node(null);
        trailer = new Node(null);
        header.next = trailer;
        trailer.prev = header;
        count = 0;
    }

     /**
     * Esvazia a lista
     */
    public void clear() {
        header = new Node(null);
        trailer = new Node(null);
        header.next = trailer;
        trailer.prev = header;
        count = 0;
    } 

    /**
     * Retorna true se a lista não contem elementos
     * @return true se a lista não contem elementos
     */
    public boolean isEmpty() {
        // retorna true se count for igual a 0
        return (count == 0);
    }
  
        
    /**
     * Retorna o numero de elementos da lista
     * @return o numero de elementos da lista
     */
    public int size() {
        // count é o contador, vai retornar ele
        return count;
    }


    /**
     * Adiciona um elemento ao final da lista
     * @param element elemento a ser adicionado ao final da lista
     */
    public void add(Integer element) {
        // Primeiro cria o nodo
        Node n = new Node(element);
        // Conecta o nodo criado na lista
        n.prev = trailer.prev;
        n.next = trailer;
        // Atualiza os encadeamentos
        trailer.prev.next = n;
        trailer.prev = n;
        // Atualiza count
        count++;      
    }

    public int indexOf(int element){
        int index = 0;
        Node aux = header.next;
            // Utilizar os nodos dessa forma pra não precisar fazer o condicional gigantesco que tava antes  (while aux.element != element && index < count) 
            
            while(aux != trailer){
                if (aux.element == element)
                    return index;
                aux = aux.next;
                index++;
            }
            throw new NoSuchElementException("Elemento não encontrado: " + element);
        }

        public int get (Integer index){
            //Pra caso errem o index passado ou algo assim 
            if (index < 0 || index >= count) 
                throw new IndexOutOfBoundsException("Índice inválido: " + index + " (tamanho: " + count + ")");
    
            Node aux = header;
            //Como já sabe aonde vai parar a ideia é um for mesmo que fica mais fácil
            for (int i = 0; i < index; i++){
                aux = aux.next;
            }
            return aux.element;
        }

        public int set (Integer index, Integer element){
            if (index < 0 || index >= count) 
                throw new IndexOutOfBoundsException("Índice inválido: " + index + " (tamanho: " + count + ")");
            Node aux = header;
            int old;
            for (int i = 0; i < index; i++){
                aux = aux.next;
            }
            old = aux.element;
            aux.element = element;
            return old;
        }

        public boolean remove (Integer element){
            Node aux = header.next;
            // Node baux = aux;
            while(aux != trailer){
                if (aux.element.equals(element)){
                    /* 
                    Essa é a versão protótipo que eu fiz mas tava estranha:
                    
                    baux = aux.prev;
                    baux.next = aux.next;
                    Node c = baux.next;
                    c.prev = baux;                    
                    aux = null;
                    count --;
                    return true; 
                    */
                    aux.next.prev = aux.prev;
                    aux.prev.next = aux.next;
                    count --; 
                    return true;
                }
                    aux = aux.next;
            }
                return false;
        }

        public boolean removeByIndex(Integer index){
            if (index < 0 || index >= count) 
                throw new IndexOutOfBoundsException("Índice inválido: " + index + " (tamanho: " + count + ")");

            Node aux = header.next;

            for (int i = 0; i < index; i++){
                aux = aux.next;
            }
            aux.next.prev = aux.prev;
            aux.prev.next = aux.next;
            count --;
            return true;
        }

        public boolean removeAll(Integer element){
            boolean remocao = false;

            Node aux = header.next;
            while (aux != trailer){
                if (aux.element.equals(element)){
                    aux.next.prev = aux.prev;
                    aux.prev.next = aux.next;
                    count --;
                    remocao = true;
                }
                aux = aux.next;
            }

            return remocao;
        }
        public boolean removeImpares(){
            boolean removeu = false;
            Node aux = header.next;

            while (aux!= trailer){
                if (aux.element % 2 == 1){
                    aux.next.prev = aux.prev;
                    aux.prev.next = aux.next;
                    removeu = true;
                    count--;
                }
                aux = aux.next;
            }
            return removeu;
        }

        public boolean contains(Integer element){

        Node aux = header.next;
        while (aux != trailer){
            if (aux.element == element)
                return true;
            aux = aux.next;
        }
        return false;
    }

    public int[] subList (int fromIndex, int toIndex){
        int[] vetor1 = new int[toIndex - fromIndex];
        Node aux = header.next;
        int pos = 0, i = 0;
        while(aux != trailer){
            if( (pos >= fromIndex) && (pos < toIndex)){
                vetor1[i] = aux.element;
                i++;
            }
            aux = aux.next;
            pos ++;
        }
        return vetor1;
    } 

     public int contaOcorrencias(int element){
        int ocorrencia = 0;

        Node aux = header.next;
        while (aux != trailer){
            if(aux.element.equals(element))
                ocorrencia++;
            aux = aux.next;
        }
        return ocorrencia;
     }



 
    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        Node aux = header.next;
        for (int i = 0; i < count; i++) {
            s.append(aux.element.toString());
            s.append("\n");
            aux = aux.next;
        }
        return s.toString();
    } 
        
}
