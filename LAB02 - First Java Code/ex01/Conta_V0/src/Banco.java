public class Banco {

    public static void main(String args[]){

        ContaV0 c1 = new ContaV0(0.0, 1000.0);
        System.out.println("Account information: ");
        System.out.println("Saldo: " + c1.getSaldo());
        System.out.println("Limite: " + c1.getLimite());

        System.out.println("Changing data: ");
        c1.setLimite(2000.0);
        c1.setSaldo(500.0);
        System.out.println("New account information: ");
        System.out.println("Saldo: " + c1.getSaldo());
        System.out.println("Limite: " + c1.getLimite());

    }
}
