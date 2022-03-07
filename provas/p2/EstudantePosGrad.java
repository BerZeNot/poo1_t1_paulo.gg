import java.util.Locale;

public class EstudantePosGrad extends Estudante implements Senioridade {
    String Nivel; // doutorado ou mestrado
    String TemaProjetoPesquisa;

    public EstudantePosGrad(String CPF, String matricula, String nome) {
        super(nome,CPF,matricula);
    }

    public int getCargaHorariaDisciplinas() {
        return super.getCargaHorariaDisciplinas();
    }

    public void setCargaHorariaDisciplinas(int cargaHorariaDisciplinas) {
        super.setCargaHorariaDisciplinas(cargaHorariaDisciplinas);
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String nivel) {
        Nivel = nivel;
    }

    public String getTemaProjetoPesquisa() {
        return TemaProjetoPesquisa;
    }

    public void setTemaProjetoPesquisa(String temaProjetoPesquisa) {
        TemaProjetoPesquisa = temaProjetoPesquisa;
    }

    @Override
    public void informacoesEstudante(){
        System.out.println("Nome: " + super.getNome());
        System.out.println("CPF: " + super.getCPF());
        System.out.println("Matricula: " + super.getMatricula() );
        System.out.println("Carga Horária: " +  super.getCargaHorariaDisciplinas());
        System.out.println("Nível: " +  Nivel);
        System.out.println("Tema de pesquisa: " +  TemaProjetoPesquisa);
    }

    @Override
    public void gerarCertificado() {
        System.out.println("Certifico que o " + super.Nome + "participa do projeto " + getTemaProjetoPesquisa());
    }

    @Override
    public void registrarVacinacao() {
        super.vacinadx = true;
    }

    @Override
    public boolean ehSenior(Senioridade obj) {
        boolean thisIsDoutor, objIsDoutor;
        thisIsDoutor = Nivel.equalsIgnoreCase("doutor");
        objIsDoutor = ((EstudantePosGrad)obj).Nivel.equalsIgnoreCase("doutor");

        return (thisIsDoutor && !objIsDoutor);
    }
}

