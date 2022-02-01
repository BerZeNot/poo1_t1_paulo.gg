package entities;

import java.util.Date;

public class Operario extends Funcionario  {

    private Double valorPorProdução;
    private Integer quantidadeProduzida;

    public Operario(String nome, Date dataNascimento, Double valorPorProdução, Integer quantidadeProduzida) {
        super(nome, dataNascimento, valorPorProdução*quantidadeProduzida);
        this.valorPorProdução = valorPorProdução;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public Double getValorPorProdução() {
        return valorPorProdução;
    }

    public void setValorPorProdução(Double valorPorProdução) {
        this.valorPorProdução = valorPorProdução;
    }

    public Integer getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    public void setQuantidadeProduzida(Integer quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public String getInfo(){
        String info = super.getInfo();
        info += " - Valor por produção: " + this.valorPorProdução;
        info += " - Quantidade produzida: " + this.quantidadeProduzida;
        return info;
    }
}
