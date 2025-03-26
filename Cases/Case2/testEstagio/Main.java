package org.testEstagio;

public class Main {
    public static void main(String[] args) {
        Item[] itens = {
                new Item("Camiseta", 49.90),
                new Item("Calça Jeans", 99.90),
                new Item("Tênis", 199.90)
        };

        ProcessadorPedidos processador = new ProcessadorPedidos();
        processador.processar(itens);

        System.out.println("Itens do pedido:");
        for (Item item : itens) {
            System.out.printf("- %s: R$%.2f\n", item.getNome(), item.getPreco());
        }

        System.out.printf("\nTotal do pedido (com impostos): R$%.2f\n", processador.getTotal());

        // Verificando o cálculo manualmente
        double subtotal = 49.90 + 99.90 + 199.90;
        double totalEsperado = subtotal * 1.1;
        System.out.printf("\nValor esperado: R$%.2f\n", totalEsperado);
    }
}
