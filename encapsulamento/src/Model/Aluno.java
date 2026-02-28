package Model;

public class Aluno {

    private String nome;
    private int pontos;
    private int nivel;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void ganharPontar(int valor){
        if(valor > 0){
            this.pontos += valor;
            atualizarNivel();
        }
    }

    private void atualizarNivel(){
        this.nivel = (this.pontos / 100) + 1;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {return pontos;}

    public void exibirStatusAluno(){
        System.out.println("========INFORMAÇÕES ALUNO========");
        System.out.println("Nome: " + nome);
        System.out.println("Pontos: " + pontos);
        System.out.println("Nível: " + nivel);
    }
}
