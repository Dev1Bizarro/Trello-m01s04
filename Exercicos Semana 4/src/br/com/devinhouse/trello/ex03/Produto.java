package br.com.devinhouse.trello.ex03;

public class Produto implements Tributavel {

    private double valor;
    private double valorImposto;

    @Override
    public double calcularValorComImposto() {
        return this.valor + this.valorImposto;
    }

}
