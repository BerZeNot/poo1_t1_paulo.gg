package entities;

public class Ingresso {
    private Double valor;

    public Ingresso(Double valor) {
        this.valor = valor;
    }

    public void escreveValor(){
        System.out.println("Valor: " + valor);
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
