package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Contato {
    protected String nome;
    protected String apelido;
    protected String email;
    protected Date aniversario;

    public Contato(String nome, String apelido, String email, Date aniversario) {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String imprimirBasico(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: " + nome);
        sb.append("\nApelido: " + apelido);
        sb.append("\nEmail: " + email);
        sb.append("\nAniversário: " + sdf.format(aniversario));
        return sb.toString();
    }

    public abstract void imprimirContato();
}
