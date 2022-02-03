package entities;

public class ProdutoComPreco extends Produto {

    private Double  precoUnitario;

    public ProdutoComPreco(int codigo, String descricao, int quantidade, Double precoUnitario) {
        super(codigo, descricao, quantidade);
        this.precoUnitario = Math.abs(precoUnitario);
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = Math.abs(precoUnitario);
    }
}
