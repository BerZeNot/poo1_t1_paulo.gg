import java.util.Date;

public class Professor extends Pessoa implements Senioridade {
    String NumeroFuncional;
    String Nome;
    String CPF;
    Date DataContrato;

    public Professor(String numeroFuncional, String nome, String CPF, Date dataContrato) {
        NumeroFuncional = numeroFuncional;
        Nome = nome;
        this.CPF = CPF;
        DataContrato = dataContrato;
    }

    public Professor(String numeroFuncional, String nome, String CPF) {
        NumeroFuncional = numeroFuncional;
        Nome = nome;
        this.CPF = CPF;
    }

    @Override
    public void gerarCertificado() {
        System.out.println("Certifico que o " + Nome + " é orientador de estudantes");
    }

    @Override
    public void registrarVacinacao() {
        super.vacinadx = true;
    }

    @Override
    public boolean ehSenior(Senioridade obj) {
        int thisIsSeniorThen = DataContrato.compareTo((Professor(obj)).DataContrato);
        if (thisIsSeniorThen > 0)
            return true;
        else
            return false;

    }
}
