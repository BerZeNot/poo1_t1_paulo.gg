package entities;

public class CamaroteInferior extends VIP{

    private String localizacao;

    public CamaroteInferior(Double valor, Double valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
