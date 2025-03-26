package org.Case3;

public class Main {
    public static void main(String[] args) {
        double[] transacoes = {800.0, 300.0}; // Total: 1100.0

        System.out.println("=== Versão Base ===");
        ContaBancaria base = new ContaBancaria();
        base.processarTransacoes(transacoes);
        System.out.println("Saldo final: " + base.getSaldo()); // 1090.0


        System.out.println("\n=== Análise do Conflito ===");
        System.out.println("Left esperava: (1100 * 1.02) - 10 = 1112.0");
        System.out.println("Right esperava: (1100 + 50) - 10 = 1140.0");
        System.out.println("Merge resultou: (1100 * 1.02 + 50) - 10 = 1140.0 (cashback parcialmente anulado)");
    }
}

