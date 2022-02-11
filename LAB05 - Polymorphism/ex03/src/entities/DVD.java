package entities;

public class DVD extends Item {
    private String diretor;

    public DVD(String titulo, int tempoDuracao, String diretor) {
        super(titulo, tempoDuracao);
        this.diretor = diretor;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("\tDiretor: " + diretor);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
