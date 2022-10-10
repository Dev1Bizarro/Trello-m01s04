package br.com.devinhouse.trello.ex02;

public class Test {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        String resultado = gerente.obterCargo();
        System.out.println(resultado);
    }
}
