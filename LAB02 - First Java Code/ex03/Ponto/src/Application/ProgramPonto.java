package Application;

import entities.Ponto;

import java.util.Locale;

public class ProgramPonto {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Ponto p1 = new Ponto(3,4);
        Ponto p2 = new Ponto(5,6);
        Ponto pSoma = Ponto.somaPontos(p1, p2);
        Ponto pSoma2 = new Ponto();
        System.out.print("A soma de ");
        p1.imprimePonto();
        System.out.print(" Com ");
        p2.imprimePonto();
        System.out.print(" é ");
        pSoma.imprimePonto();

        System.out.println("\n------------------------------");
        Ponto.somaPontos(p1, p2, pSoma2);
        System.out.print("A soma de ");
        p1.imprimePonto();
        System.out.print(" Com ");
        p2.imprimePonto();
        System.out.print(" é ");
        pSoma2.imprimePonto();



    }
}
