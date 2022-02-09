package entities;

public class VIP extends Ingresso {

    private Double valorAdicional;

    public VIP(Double valor, Double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public Double valorDoIngresso(){
        return super.getValor() + this.valorAdicional;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}
