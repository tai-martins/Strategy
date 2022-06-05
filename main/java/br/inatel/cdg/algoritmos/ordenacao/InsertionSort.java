package br.inatel.cdg.algoritmos.ordenacao;

public class InsertionSort implements Ordenacao{

    @Override
    public int[] ordenar(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {

            int j = i;

            while (j > 0 && vetor[j] < vetor[j-1]) {
                int aux = vetor[j];
                vetor[j] = vetor[j - 1];
                vetor[j - 1] = aux;
                j -= 1;
            }

        }
        return vetor;
    }
}
