public class EstudanteGrad extends Estudante implements Senioridade{
    private int CargaHorariaComplementar;
    private String TituloTCC;
    private String LocalEstagio;

    public EstudanteGrad(String cpf, String matricula, String nome) {
        super(nome, cpf, matricula);
    }

    public int getCargaHorariaDisciplinas() {
        return super.getCargaHorariaDisciplinas();
    }

    public void setCargaHorariaDisciplinas(int cargaHorariaDisciplinas) throws CargaHorariaInvalidaExeption{
        if(cargaHorariaDisciplinas < 0)
            throw new CargaHorariaInvalidaExeption("O valor da carga horária deve ser positivo");
        else if(cargaHorariaDisciplinas > 3000)
            throw new CargaHorariaInvalidaExeption("O valor da carca horária deve ser menor ou igual a 3000");

        super.setCargaHorariaDisciplinas(cargaHorariaDisciplinas);
    }

    public int getCargaHorariaComplementar() {
        return CargaHorariaComplementar;
    }

    public void setCargaHorariaComplementar(int cargaHorariaComplementar) {
        CargaHorariaComplementar = cargaHorariaComplementar;
    }

    public String getTituloTCC() {
        return TituloTCC;
    }

    public void setTituloTCC(String tituloTCC) {
        TituloTCC = tituloTCC;
    }

    public String getLocalEstagio() {
        return LocalEstagio;
    }

    public void setLocalEstagio(String localEstagio) {
        LocalEstagio = localEstagio;
    }

    @Override
    public void informacoesEstudante(){
        System.out.println("Nome: " + super.Nome);
        System.out.println("CPF: " + super.CPF);
        System.out.println("Matricula: " + super.Matricula );
        System.out.println("Carga Horária: " +  super.CargaHorariaDisciplinas);
        System.out.println("Horas complementares: " +  CargaHorariaComplementar);
        System.out.println("Local do estágio: " +  CargaHorariaComplementar);
        System.out.println("Título do TCC: " +  TituloTCC);
    }

    @Override
    public void gerarCertificado() {
        System.out.println("Certifico que o aluno "
                + super.Nome
                + " realiza estágio em "
                + getLocalEstagio());
    }

    @Override
    public void registrarVacinacao() {
        super.vacinadx = true;
    }

    @Override
    public boolean ehSenior(Senioridade obj) {
        int creditos, creditosObj;
        creditos = this.CargaHorariaComplementar + getCargaHorariaDisciplinas();
        creditosObj = ((EstudanteGrad)obj).getCargaHorariaComplementar() + ((EstudanteGrad)obj).getCargaHorariaDisciplinas();

        return (creditos > creditosObj) ? true : false;
    }
}
