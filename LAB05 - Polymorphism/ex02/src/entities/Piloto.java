package entities;

public class Piloto extends Funcionario {

    private Integer numHoras;

    public Piloto(String nome, String cpf, String rg, Integer idade, Integer matricula, Integer numHoras) {
        super(nome, cpf, rg, idade, matricula);
        this.numHoras = numHoras;
    }

    @Override
    public Float calculaSalario(){
        return (salarioBase * numHoras * 4);
    }

    @Override
    public String toString() {
        return "Piloto{\n" +
                "\tmatricula=" + matricula + ",\n" +
                "\tnome='" + nome + '\'' + ",\n" +
                "\tcpf='" + cpf + '\'' + ",\n" +
                "\trg='" + rg + '\'' + ",\n" +
                "\tnumHoras=" + numHoras + ",\n" +
                "\tsalarioBase=" + salarioBase + "\n" +
                '}';
    }
}
