
public class App {
    public static void main(String[] args) {
        DoubleLinkedListOfInteger l = new DoubleLinkedListOfInteger();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);
        l.add(70);
        l.add(80);
        
        System.out.println(l);
        System.out.println("size="+l.size());
      
    //    System.out.println("Get da posicao 2: " + l.get(2));
    //    System.out.println("Get da posicao 6: " + l.get(6));
        
    //    System.out.println("Trocou " + l.set(2, 35) + " por 35 na posicao 2.");
        
     //   System.out.println("Removeu 50? " + l.remove(50));
    //System.out.println("Removeu 57? " + l.remove(57));
        
        System.out.println(l);
        
      
        DoubleLinkedListOfInteger l2 = new DoubleLinkedListOfInteger();
        l2.add(35);
        l2.add(5);
        l2.add(50);
        l2.add(60);
        l2.add(10);
        l2.add(10);

        System.out.println("Conteudo lista l2:\n" + l2);
        // System.out.println("O index do 20 eh: " + l2.indexOf(12));
        System.out.println("Eh verdade que tem ?  " + l2.contains(5));
        System.out.println("O elemento desejado eh o: " + l2.get(3));
        // System.out.println(l2.remove(50));
        // System.out.println(l2.removeByIndex(3));
        // System.out.println("Pós remoção: " + l2);
        
        int[] j = l2.subList(0,2);
        for (int i = 0; i < j.length; i++){
            System.out.println("Numero: " +j[i]);
        }
        
        System.out.println("O numero 10 repete: " + l2.contaOcorrencias(10) );
        l2.removeImpares();
        System.out.println("Lista pos remoção dos impares: " + l2);

        

    }
    
}
