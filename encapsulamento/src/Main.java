import Model.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ex04");

        Scanner input = new Scanner(System.in);

        User usuario = new User("TESTE123");

        System.out.print("Digite a senha atual: ");
        String senhaAtual = input.nextLine();

        System.out.print("Digite a nova senha: ");
        String novaSenha = input.nextLine();

        if (usuario.alterarSenha(senhaAtual, novaSenha)) {
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("Senha atual incorreta!");
        }

        input.close();
    }
}