package org.Case4;

public class GerenciadorTarefas {
    private String status;
    private int progresso;

    public void atualizarConclusao(int subtarefasCompletas) {
        progresso = subtarefasCompletas * 10;
        if (progresso >= 100) {
            status = "Concluído";
        } else if (progresso > 50) {
            status = "Quase Finalizado";
        } else {
            status = "Em Andamento";
        }
    }

    public void exibirStatus() {
        System.out.println("Status: " + status + " (" + progresso + "%)");
    }

    public int getProgresso() {
        return progresso;
    }

    public String getStatus() {
        return status;
    }
}










