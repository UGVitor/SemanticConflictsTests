package org.Case4;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GerenciadorTarefas tarefa = new GerenciadorTarefas();

        System.out.println("--- Cenário 1: Teste da Branch Left ---");
        tarefa.atualizarConclusao(2); // 20%
       tarefa.verificarBloqueios();
    //    tarefa.validarProgresso(); // Interferência da Right
        tarefa.exibirStatus();
        // Esperado (Left): Bloqueado
        // Real: Precisa Revisar (conflito)

        System.out.println("\n--- Cenário 2: Teste da Branch Right ---");
        tarefa.atualizarConclusao(7); // 70%
      tarefa.verificarBloqueios(); // Interferência da Left
        tarefa.validarProgresso();
        tarefa.exibirStatus();
        // Esperado (Right): Precisa Revisar
        // Real: Precisa Revisar (aparentemente ok)

        System.out.println("\n--- Cenário 3: Progresso completo ---");
        tarefa.atualizarConclusao(10); // 100%
        tarefa.verificarBloqueios();
     //   tarefa.validarProgresso();
        tarefa.exibirStatus();
        // Esperado: Concluído
        // Real: Concluído (funciona corretamente)

        System.out.println("\n--- Detalhes do Conflito ---");
        System.out.println("Problema: Ambos métodos verificarBloqueios() e validarProgresso()");
        System.out.println("modificam a mesma variável 'status' sem conhecimento mútuo.");
        System.out.println("Na versão merged, o último método chamado sobrescreve as alterações do anterior.");
    }
}