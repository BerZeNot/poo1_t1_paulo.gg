package entities;

public class Atendente extends Funcionario {
    private Float comissao;
    private Integer numVendas;

    public Atendente(String nome, String cpf, String rg, Integer idade, Integer matricula) {
        super(nome, cpf, rg, idade, matricula);
        comissao = 0.45f;
        numVendas = 0;
    }

    public void computaVenda() {
        numVendas++;
    }

    @Override
    public Float calculaSalario() {
        return salarioBase + (comissao * numVendas);
    }

    @Override
    public String toString() {
        return "Atendente{\n" +
                "\tcomissao=" + comissao + ",\n" +
                "\tnumVendas=" + numVendas + ",\n" +
                "\tmatricula=" + matricula + ",\n" +
                "\tsalarioBase=" + salarioBase + ",\n" +
                "\tnome='" + nome + '\'' + ",\n" +
                "\tcpf='" + cpf + '\'' + ",\n" +
                "\trg='" + rg + '\'' + "\n" +
                '}';
    }
}
