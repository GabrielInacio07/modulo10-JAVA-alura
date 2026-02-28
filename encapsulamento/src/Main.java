import Model.Aluno;
import Model.Disciplina;
import Model.Login;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Disciplina materia = new Disciplina("Matemática");

        materia.adicionarNota(10);
        materia.adicionarNota(-5);
        materia.adicionarNota(3);
        materia.adicionarNota(-2);

        materia.showDetails();

        input.close();
    }
}