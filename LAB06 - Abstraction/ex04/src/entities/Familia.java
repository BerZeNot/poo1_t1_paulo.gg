package entities;

import java.util.Date;

public class Familia extends Contato{

    private String parentesco;

    public Familia(String nome, String apelido, String email, Date aniversario, String parentesco) {
        super(nome, apelido, email, aniversario);
        this.parentesco = parentesco;
    }

    @Override
    public void imprimirContato() {
        System.out.println(super.imprimirBasico());
        System.out.println("Parentesco: " + parentesco);
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
}
