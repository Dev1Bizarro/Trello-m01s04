package br.com.devinhouse.trello.ex01;


import br.com.devinhouse.trello.ex01.Conta;
import br.com.devinhouse.trello.ex01.Operavel;

public class ContaCorrente extends Conta implements Operavel {

        private double saldo;

        @Override
        protected double obterSaldoAtual() {
            return saldo;
        }

        @Override
        public void depositar(double valor) {
            this.saldo += valor;
        }

        @Override
        public double sacar(double valor) {
            saldo -= valor;
            return saldo;
        }
    }

