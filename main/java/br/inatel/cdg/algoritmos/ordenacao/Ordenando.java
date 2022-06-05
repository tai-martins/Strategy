package br.inatel.cdg.algoritmos.ordenacao;

public abstract class Ordenando {

    protected Ordenacao ordenacao;

    public int[]ordenar(int[] vetor){
        return ordenacao.ordenar(vetor);
    }

    public Ordenacao getOrdenacao() {
        return ordenacao;
    }

    public void setOrdenacao(Ordenacao ordenacao) {
        this.ordenacao = ordenacao;
    }
}
