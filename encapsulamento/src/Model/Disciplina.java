package Model;

import java.util.ArrayList;

public class Disciplina {

    private String nome;
    private ArrayList<Double> listaNotas = new ArrayList<>();
    private int notasValidas = 0;
    private int notasIgnoradas = 0;

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public void adicionarNota(double valor){
        if(valor >= 0 && valor <= 10){
            listaNotas.add(valor);
            notasValidas++;
        } else {
            notasIgnoradas++;
            System.out.println("Nota inválida ignorada: " + valor);
        }
    }

    public double calcularMedia(){
        if(listaNotas.isEmpty()){
            return 0;
        }

        double soma = 0;

        for(Double nota : listaNotas){
            soma += nota;
        }

        return soma / listaNotas.size();
    }

    public void showDetails(){
        System.out.println("===== Disciplina: " + nome + " =====");
        System.out.println("Notas válidas: " + notasValidas);
        System.out.println("Notas ignoradas: " + notasIgnoradas);
        System.out.println("Média: " + calcularMedia());
    }

    public String getNome() {
        return nome;
    }
}