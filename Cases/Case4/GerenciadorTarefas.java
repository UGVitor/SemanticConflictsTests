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
    public void verificarBloqueios() {
        if (progresso < 30) {
            status = "Bloqueado";
        }
    }
    public void exibirStatus() {
        System.out.println("Status: " + status + " (" + progresso + "%)");
    }
    public void validarProgresso() {
        if (progresso > 0 && progresso < 100) {
            status = "Precisa Revisar";
        }
    }
    public int getProgresso() {
        return progresso;
    }

    public String getStatus() {
        return status;
    }
}










