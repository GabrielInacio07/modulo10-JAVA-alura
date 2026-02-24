package Model;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double alterPrice) {

        if (alterPrice < 0) {
            System.out.println("Preço inválido.");
            this.preco = 0.00;
        } else {
            this.preco = alterPrice;
        }
    }

    public void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Produto: " + preco);
    }
}