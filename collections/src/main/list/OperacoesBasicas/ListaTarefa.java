package main.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa(List<Tarefa> tarefaList) {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa(null);
        System.out.println(listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        System.out.println(listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");

        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println(listaTarefa.obterNumeroTotalTarefas());

        // listaTarefa.removerTarefa("Tarefa 1");
        System.out.println(listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }

}
