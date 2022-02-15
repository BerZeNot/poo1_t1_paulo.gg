package entities;

public class Funcionario extends Pessoa {

    protected Integer matricula;
    protected Float salarioBase;

    public Funcionario(String nome, String cpf, String rg, Integer idade, Integer matricula) {
        super(nome, cpf, rg, idade);
        this.matricula = matricula;
        this.salarioBase = 1000f;
    }

    public Float calculaSalario(){
        return salarioBase;
    }
}
