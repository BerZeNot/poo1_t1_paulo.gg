package entities;

import java.util.Date;

public class Funcionario {
    private String nome;
    private Date dataNascimento;
    private Double salario;

    public Funcionario(String nome, Date dataNascimento, Double salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getInfo(){
        String info = "Nome: " + getNome();
        info += " - Data de Nascimento: " + getDataNascimento();
        info += " - Salário: R$ " + getSalario();
        return info;
    }
}
