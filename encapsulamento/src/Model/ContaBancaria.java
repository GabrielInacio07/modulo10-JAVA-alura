
package Model;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {

        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado. Saldo atual: " + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {

        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual de " + titular + ": " + saldo);
    }
}
