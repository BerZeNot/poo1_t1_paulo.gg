package entities;

import java.util.Date;

public class Gerente {
    private String nome;
    private String cpf;
    private Date dataDeNascimento;
    private Date dataDeAdmissao;
    private String endereco;
    private String cidade;
    private String estado;

    public Gerente(String nome, String cpf, Date dataDeNascimento, Date dataDeAdmissao, String endereco, String cidade, String estado) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.dataDeAdmissao = dataDeAdmissao;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public Date getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
