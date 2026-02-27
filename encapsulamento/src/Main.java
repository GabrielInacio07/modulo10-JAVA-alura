import Model.Filme;

public class Main {

    public static void main(String[] args) {

        Filme filme = new Filme("Rambo");

        filme.adicionarAvaliacao(5);
        filme.adicionarAvaliacao(4);
        filme.adicionarAvaliacao(3);

        filme.exibirMedia();
    }
}