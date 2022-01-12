public class Conta {
    private double saldo;
    private double limite;

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public void sacar(double valor){
        if(valor > 0 && valor <= saldo && valor<=limite);{
            saldo-= valor;
            System.out.println("Sacou R$ " + valor);
        }

    }
    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Depositou R$ " + valor);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
