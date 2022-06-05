import br.inatel.cdg.algoritmos.ordenacao.*;

import org.junit.Test;

public class Teste {

    Ordenando ordenando;

    @Test
    public void testeBubbleSort(){
        ordenando = new Bubble();
        int[] vetor= {8, 5, 12, 7, 22};
    }

    @Test
    public void testeInsertionSort(){
        ordenando = new Insertion();
        int[] vetor = {8, 5, 12, 7, 22};
    }

    @Test
    public void testeSelectionSort(){
        ordenando = new Selection();
        int[] vetor = {8, 5, 12, 7, 22};
    }

}
