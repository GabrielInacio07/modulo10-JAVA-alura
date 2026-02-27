package Model;

import java.util.ArrayList;

public class Filme {

    private String title;
    private ArrayList<Integer> avaliacoes;

    public Filme(String title) {
        this.title = title;
        this.avaliacoes = new ArrayList<>();
    }

    public void adicionarAvaliacao(int nota) {

        if (nota >= 1 && nota <= 5) {
            avaliacoes.add(nota);
        } else {
            System.out.println("Avaliação inválida! Insira um valor entre 1 e 5.");
        }
    }

    public double calcularMedia() {
        if (avaliacoes.isEmpty()) {
            return 0;
        }

        int soma = 0;

        for (int nota : avaliacoes) {
            soma += nota;
        }
        return (double) soma / avaliacoes.size();
    }

    public void exibirMedia() {
        System.out.printf("Média das avaliações do filme %s: %.2f%n",
                title,
                calcularMedia());
    }
}