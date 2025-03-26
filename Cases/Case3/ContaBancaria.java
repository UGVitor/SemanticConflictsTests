package org.Case3;

public class ContaBancaria {
    protected double saldo;

    public void processarTransacoes(double[] transacoes) {
        saldo = 0;
        aplicarTransacoes(transacoes);
    	aplicarBonusFidelidade();
        aplicarTaxaManutencao();
    	aplicarCashback(); 

    }

    protected void aplicarTransacoes(double[] transacoes) {
        for (double valor : transacoes) {
            saldo += valor;
        }
    }

    protected void aplicarTaxaManutencao() {
        saldo -= 10.0;
    }

    private void aplicarBonusFidelidade() {
    	saldo += 50.0; // Bônus fixo para clientes fiéis
    }

    public double getSaldo() {
        return saldo;
    }

    private void aplicarCashback() {
    if (saldo > 1000) {
        saldo *= 1.02; // 2% de cashback para saldos altos
    }
}

}

