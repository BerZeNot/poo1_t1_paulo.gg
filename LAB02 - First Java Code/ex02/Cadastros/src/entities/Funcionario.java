package entities;

public class Funcionario {

    private String cpf;
    private String nome;
    private String dataDeNascimento;
    private String dataDeIngresso;

    public Funcionario(String cpf, String nome, String dataDeNascimento, String dataDeIngresso) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.dataDeIngresso = dataDeIngresso;
    }

    public void getInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de nascimento " + dataDeNascimento);
        System.out.println("Data de ingresso: " + dataDeIngresso);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getDataDeIngresso() {
        return dataDeIngresso;
    }

    public void setDataDeIngresso(String dataDeIngresso) {
        this.dataDeIngresso = dataDeIngresso;
    }
}
