import Model.Bateria;
import Model.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ex05");

        Scanner input = new Scanner(System.in);
        Bateria battery = new Bateria();

        System.out.println("Digite o nível da bateria:");
        int nivelBattery = Integer.parseInt(input.nextLine());

        battery.setNivel(nivelBattery);

        System.out.println(battery.verificarStatus());

        input.close();
    }
}