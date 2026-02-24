import Model.Agenda;
import Model.Carro;

import java.util.ArrayList;

class Main{
    static void main(String[] args) {
        System.out.println("Ex02");
        ArrayList<Agenda> listaAgend = new ArrayList<>();

        listaAgend.add(new Agenda("Gabriel","(18) 99999-0000"));
        listaAgend.add(new Agenda("João","(22) 3333-0000"));

        listaAgend.add(new Agenda("Lucas","(32) 44444-0000"));
        listaAgend.add(new Agenda("Vitor","(11) 22222-0000"));

        System.out.println("Agenda Telefônica");
        for(Agenda agend : listaAgend){
            agend.showDetails();
        }

    }
}