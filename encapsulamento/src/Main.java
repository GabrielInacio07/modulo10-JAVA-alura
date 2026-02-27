import Model.Login;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Login usuario = new Login("adminTESTE", "admin@123");

        int tentativas = 3;

        while (tentativas > 0) {

            System.out.print("Login: ");
            String loginDigitado = input.nextLine();

            System.out.print("Senha: ");
            String senhaDigitada = input.nextLine();

            if (usuario.validarSenha(loginDigitado, senhaDigitada)) {
                System.out.println("Login bem-sucedido!");
                break;
            } else {
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Senha incorreta. Tentativas restantes: " + tentativas);
                } else {
                    System.out.println("Acesso bloqueado.");
                }
            }
        }

        input.close();
    }
}