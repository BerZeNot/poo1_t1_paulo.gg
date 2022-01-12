public class Banco {
    public static void main(String[] args) {
        Conta c1 = new Conta(0.0, 1000.0);

        c1.depositar(500);
        System.out.println("Informações da conta:");
        System.out.println("Saldo: " + c1.getSaldo());
        System.out.println("Limite: " + c1.getLimite());

        c1.sacar(250.0);

    }
}
