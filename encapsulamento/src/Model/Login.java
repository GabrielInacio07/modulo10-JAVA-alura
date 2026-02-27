package Model;

public class Login {

    private String login;
    private String senha;

    public Login(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public boolean validarSenha(String loginDigitado, String senhaDigitada) {
        return this.login.equals(loginDigitado) &&
                this.senha.equals(senhaDigitada);
    }
}