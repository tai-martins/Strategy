package br.inatel.cdg.algoritmos.ordenacao;

public class SelectionSort implements Ordenacao{
    @Override
    public int[] ordenar(int[] vetor) {
        for (int valor = 0; valor < vetor.length - 1; valor++) {
            int menor = valor;

            for (int i = menor + 1; i < vetor.length; i++) {
                if (vetor[i] < vetor[menor]) {
                    menor = i;
                }
            }
            if (menor != valor) {
                int t = vetor[valor];
                vetor[valor] = vetor[menor];
                vetor[menor] = t;
            }
        }
        return vetor;
    }
}
