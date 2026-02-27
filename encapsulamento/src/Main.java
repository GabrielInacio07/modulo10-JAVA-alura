
import Model.ContaBancaria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ex06");

        Scanner input = new Scanner(System.in);
        ContaBancaria banco = new ContaBancaria("Jhonny");

        banco.depositar(200);
        banco.sacar(10);
        banco.sacar(500);

        banco.exibirSaldo();

        input.close();
    }
}