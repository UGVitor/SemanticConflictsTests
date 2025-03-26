package org.testEstagio;

public class ProcessadorPedidos {
    private double totalPedido;

    public void processar(Item[] itens) {
        totalPedido = 0;
        calcularSubtotal(itens);
        aplicarImpostos();
    }

    private void calcularSubtotal(Item[] itens) {
        for (Item item : itens) {
            totalPedido += item.getPreco();
        }
    }

    private void aplicarImpostos() {
        totalPedido *= 1.1; // Acrescenta 10% de impostos
    }

    public double getTotal() {
        return totalPedido;
    }
}