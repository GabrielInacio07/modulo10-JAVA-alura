import Model.Carro;

class Main{
    static void main(String[] args) {
        System.out.println("Ex01");

        Carro car = new Carro("Tracker","AYN-345",2025);

        System.out.println("Veículo cadastrado:");
        System.out.println("Modelo: " + car.getModelo());
        System.out.println("Placa: " + car.getPlaca());
        System.out.println("Ano: " + car.getAno());
    }
}