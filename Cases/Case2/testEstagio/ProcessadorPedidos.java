package org.testEstagio;

public class ProcessadorPedidos {
    private double totalPedido;

    public void processar(Item[] itens) {
        totalPedido = 0;
        calcularSubtotal(itens);
	aplicarDesconto();
        aplicarImpostos();
	calcularFrete();
    }

    private void calcularSubtotal(Item[] itens) {
        for (Item item : itens) {
            totalPedido += item.getPreco();
        }
    }

    private void aplicarImpostos() {
        totalPedido *= 1.1; // Acrescenta 10% de impostos
    }

    private void calcularFrete() {
        totalPedido += 15.0; // Adiciona valor fixo de frete
}
    public double getTotal() {
        return totalPedido;
    }


    private void aplicarDesconto(){
    if (totalPedido > 100){
	totalPedido *= 0.9;
	}
}

}