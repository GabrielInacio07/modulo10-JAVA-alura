package Model;

import java.io.IOException;

public class Bateria {

    private int nivel;

    public Bateria() {

    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {

        if(nivel >=0 && nivel <= 100){
            this.nivel = nivel;
        }else {
            throw new IllegalArgumentException("Nível inválido! Deve estar entre 0 e 100.");
        }
    }

    public String verificarStatus() {

        if (nivel <= 20) {
            return "Bateria fraca";
        } else if (nivel <= 79) {
            return "Bateria ok";
        } else {
            return "Bateria cheia";
        }
    }
}
