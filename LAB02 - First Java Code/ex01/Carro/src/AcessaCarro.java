public class AcessaCarro {

    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo("Ford", "GTI-1012", 1200, 240);
        System.out.println("Informações do carro: ");
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Placa: " + carro1.getPlaca());
        System.out.println("Kilometragem: " + carro1.getKilometragem());
        System.out.println("Velocidade máxima: " + carro1.getVelocidadeMaxima());

        while (carro1.getVelocidadeAtual() < 60)
            carro1.acelera();

        while (carro1.getVelocidadeAtual() > 0)
            carro1.freia();

    }
}