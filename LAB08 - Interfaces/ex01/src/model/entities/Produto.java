package model.entities;

import model.interfaces.Classificavel;

import java.util.Objects;

public class Produto implements Classificavel {
    private Integer codigo;
    private String nome;
    private Double preco;

    public Produto(Integer codigo, String nome, Double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public boolean eMenorQue(Classificavel obj) {
        if(this.codigo < ((Produto)obj).getCodigo())
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return codigo.equals(produto.codigo) && nome.equals(produto.nome) && preco.equals(produto.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome, preco);
    }
}
