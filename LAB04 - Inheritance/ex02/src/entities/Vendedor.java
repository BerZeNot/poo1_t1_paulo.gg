package entities;

import java.util.Date;

public class Vendedor extends Funcionario {
    private Double valorFixo;
    private Double comissao;
    private Integer quantidadeVendas;

    public Vendedor(String nome, Date dataNascimento, Double valorFixo, Double comissao, Integer quantidadeVendas) {
        super(nome, dataNascimento, (valorFixo + (comissao * quantidadeVendas)));
        this.valorFixo = valorFixo;
        this.comissao = comissao;
        this.quantidadeVendas = quantidadeVendas;
    }

    public Double getValorFixo() {
        return valorFixo;
    }

    public void setValorFixo(Double valorFixo) {
        this.valorFixo = valorFixo;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public Integer getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(Integer quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    public String getInfo(){
        String info = super.getInfo();
        info += " - Valor fixo: " + valorFixo;
        info += " - Comissão: " + comissao;
        info += " - Quantidade de Vendas: " + quantidadeVendas;
        return info;
    }
}
