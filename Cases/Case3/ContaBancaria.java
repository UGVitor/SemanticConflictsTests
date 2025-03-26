package org.Case3;

public class ContaBancaria {
    protected double saldo;

    public void processarTransacoes(double[] transacoes) {
        saldo = 0;
        aplicarTransacoes(transacoes);
        aplicarTaxaManutencao();

    }

    protected void aplicarTransacoes(double[] transacoes) {
        for (double valor : transacoes) {
            saldo += valor;
        }
    }

    protected void aplicarTaxaManutencao() {
        saldo -= 10.0;
    }

    public double getSaldo() {
        return saldo;
    }

}

