package entities;

public class CD extends Item {
    private String artista;

    public CD(String titulo, int tempoDuracao, String artista) {
        super(titulo, tempoDuracao);
        this.artista = artista;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("\tAtista: " + artista);
    }
}
