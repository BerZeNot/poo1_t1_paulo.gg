public abstract class Estudante extends Pessoa{

    protected String Nome;
    protected String CPF;
    protected String Matricula;
    protected int CargaHorariaDisciplinas;

    public Estudante(String nome, String CPF, String matricula) {
        Nome = nome;
        this.CPF = CPF;
        Matricula = matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public int getCargaHorariaDisciplinas() {
        return CargaHorariaDisciplinas;
    }

    public void setCargaHorariaDisciplinas(int cargaHorariaDisciplinas) {
        CargaHorariaDisciplinas = cargaHorariaDisciplinas;
    }

    public void informacoesEstudante(){}


    public abstract void gerarCertificado();

    public abstract void registrarVacinacao();
}
