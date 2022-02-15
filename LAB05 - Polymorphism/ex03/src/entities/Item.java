package entities;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String titulo;
    private int tempoDuracao;
    private List<String> comentarios;

    public Item(String titulo, int tempoDuracao) {
        this.titulo = titulo;
        this.tempoDuracao = tempoDuracao;
        comentarios = new ArrayList<>();
    }

    private void adicionarComentarios(String comentario){
        this.comentarios.add(comentario);
    }

    public void print(){
        System.out.println("Item" + "\n" +
                "\ttitulo='" + titulo + '\'' + ",\n" +
                "\ttempoDuracao=" + tempoDuracao + ",\n" +
                "\tcomentarios=" + comentarios + ",");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(int tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }
}
