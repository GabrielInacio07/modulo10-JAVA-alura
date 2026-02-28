import Model.Aluno;
import Model.Login;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Aluno student = new Aluno("Gabriel Inácio");

        System.out.print("Olá " + student.getNome() + " digite sua pontuação: ");
        int pontos = Integer.parseInt(input.nextLine());

        student.ganharPontar(pontos);

        student.exibirStatusAluno();

        input.close();
    }
}