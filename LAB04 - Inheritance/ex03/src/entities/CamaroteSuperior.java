package entities;

public class CamaroteSuperior extends VIP{

    private String localizacao;
    private Double adicionalCamaroteSuperior;
    public CamaroteSuperior(Double valor, Double valorAdicional, String localizacao, Double adicionalCamaroteSuperior) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
        this.adicionalCamaroteSuperior = adicionalCamaroteSuperior;
    }

    private Double getValorTotalCamarote(){
        return super.valorDoIngresso() + this.adicionalCamaroteSuperior;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Double getAdicionalCamaroteSuperior() {
        return adicionalCamaroteSuperior;
    }

    public void setAdicionalCamaroteSuperior(Double adicionalCamaroteSuperior) {
        this.adicionalCamaroteSuperior = adicionalCamaroteSuperior;
    }
}
