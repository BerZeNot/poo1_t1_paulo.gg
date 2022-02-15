package entities;

public class Pessoa {
    protected String nome, cpf, rg;
    private Integer idade;

    public Pessoa(String nome, String cpf, String rg, Integer idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
    }


}
