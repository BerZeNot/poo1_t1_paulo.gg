package application;

import entities.Retangulo;

import java.util.Scanner;

/**
 * (a)	Peça para o usuário informar os pontos que definem
 *     o retângulo e mostre a área do mesmo.
 */

public class ProgramA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe x1: ");
        int x1 = sc.nextInt();
        System.out.print("Informe y1: ");
        int y1 = sc.nextInt();

        System.out.print("Informe x2: ");
        int x2 = sc.nextInt();
        System.out.print("Informe y2: ");
        int y2 = sc.nextInt();

        Retangulo r1 = new Retangulo(x1, y1, x2, y2);

        System.out.println("Os pontos que definem o retângulo são: "
                + "p1: " + r1.getP1()
                + " p2: " + r1.getP2());

        System.out.println("A área do Retângulo é: " + r1.getArea());

        sc.close();
    }
}
