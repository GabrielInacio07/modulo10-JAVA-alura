package Model;

public class User {

    private String senha;

    public User(String senha) {
        this.senha = senha;
    }

    public boolean alterarSenha(String senhaAtual, String novaSenha) {

        if (senhaAtual.equals(this.senha)) {
            this.senha = novaSenha;
            return true;
        }

        return false;
    }
}