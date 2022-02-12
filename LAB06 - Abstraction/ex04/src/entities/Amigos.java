package entities;

import java.util.Date;

public class Amigos extends Contato {

    private int grau;

    public Amigos(String nome, String apelido, String email, Date aniversario, int grau) {
        super(nome, apelido, email, aniversario);
        this.grau = grau;
    }

    @Override
    public void imprimirContato() {
        System.out.println(super.imprimirBasico());
        switch (grau){
            case 1:
                System.out.println("Grau de amizade: melhor amigo");
                break;
            case 2:
                System.out.println("Grau de amizade: amigo");
                break;
            case 3:
                System.out.println("Grau de amizade: conhecido");
                break;
            default:
                System.out.println("Grau de amizade: " + grau + " é um grau de amizade desconhecido!");
                break;
        }
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }
}
