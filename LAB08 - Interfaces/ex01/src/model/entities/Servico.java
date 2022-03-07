package model.entities;

import model.interfaces.Classificavel;

import java.util.Objects;

public class Servico implements Classificavel {

    private String nome;
    private String descricao;
    private Double preco;

    public Servico(String nome, String descricao, Double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Servico)) return false;
        Servico servico = (Servico) o;
        return nome.equals(servico.nome) && descricao.equals(servico.descricao) && preco.equals(servico.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, preco);
    }

    @Override
    public String toString() {
        return "Servico{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean eMenorQue(Classificavel obj) {
        if(this.preco < ((Servico)obj).getPreco()){
            return true;
        } else {
            return false;
        }
    }
}
