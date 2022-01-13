package Application;

import entities.Ponto;

import java.util.Locale;
import java.util.Scanner;

public class ProgramPonto {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x1, y1, x2, y2;

        // Lê e imprime no console
        System.out.print("Digite o valor de x: ");
        x1 = sc.nextDouble();
        System.out.print("Digite o valor de y: ");
        y1 = sc.nextDouble();
        Ponto p1 = new Ponto(x1,y1);
        System.out.print("O ponto digitado é: ");
        p1.imprimePonto();

//        // Lê dois pontos, soma e imprime com imprimePonto()
        System.out.println("\n------------------------------");

        System.out.print("\nDigite o valor de x1: ");
        x1 = sc.nextDouble();
        System.out.print("Digite o valor de y1: ");
        y1 = sc.nextDouble();
        p1 = new Ponto(x1,y1);

        System.out.print("Digite o valor de x2: ");
        x2 = sc.nextDouble();
        System.out.print("Digite o valor de y2: ");
        y2 = sc.nextDouble();
        Ponto p2 = new Ponto(x2,y2);

        Ponto pSoma = Ponto.somaPontos(p1, p2);
        Ponto pSoma2 = new Ponto();
        System.out.print("A soma de ");
        p1.imprimePonto();
        System.out.print(" Com ");
        p2.imprimePonto();
        System.out.print(" é ");
        pSoma.imprimePonto();
//
////        Faz a soma assim como no código acima, porém usa um método void que coloca o
////        valor na variável de resultado
//
        System.out.println("\n------------------------------");
        System.out.print("\nDigite o valor de x1: ");
        x1 = sc.nextDouble();
        System.out.print("Digite o valor de y1: ");
        y1 = sc.nextDouble();
        p1 = new Ponto(x1,y1);

        System.out.print("Digite o valor de x2: ");
        x2 = sc.nextDouble();
        System.out.print("Digite o valor de y2: ");
        y2 = sc.nextDouble();
        p2 = new Ponto(x2,y2);
        Ponto.somaPontos(p1, p2, pSoma2);
        System.out.print("A soma de " + p1 + " com " + p2 + " é " + pSoma2);
//
////        Calcula a área de um retângulo formado por dois pontos

        System.out.println("\n------------------------------");
        System.out.println("Cálculo da área do retângulo:");
        System.out.print("\nDigite o valor de x1: ");
        x1 = sc.nextDouble();
        System.out.print("Digite o valor de y1: ");
        y1 = sc.nextDouble();
        p1 = new Ponto(x1,y1);

        System.out.print("Digite o valor de x2: ");
        x2 = sc.nextDouble();
        System.out.print("Digite o valor de y2: ");
        y2 = sc.nextDouble();
        p2 = new Ponto(x2,y2);
        double areaDoRetangulo = Ponto.calcArea(p1, p2);
        if(areaDoRetangulo != -1)
            System.out.println("A área do retângulo definido por " + p1 + " e " + p2 + " é " + areaDoRetangulo);

        System.out.println("\n------------------------------");
//
////        Multiplicação de um ponto por constante
        System.out.println("Multiplicação de um ponto por constante");
        System.out.println("Digite o ponto: ");
        System.out.print("x: ");
        x1 = sc.nextDouble();
        System.out.print("y: ");
        y1 = sc.nextDouble();
        p1 = new Ponto(x1,y1);
        System.out.print("Digite a constante: ");
        double constante  = sc.nextDouble();
        System.out.print("Resultado: " + p1 + " * " + constante + " = ");
        Ponto.multiplicaPorConstante(p1, constante);
        System.out.print(p1 + "\n");

        // Move o ponto em uma direção N S L O
        System.out.println("\n------------------------------");
        System.out.println("Move o ponto em uma direção");
        System.out.print(p1 + " norte => ");
        p1.incDir('n');
        System.out.print(p1 + "\n");

        System.out.print(p1 + " sul => ");
        p1.incDir('s');
        System.out.print(p1 + "\n");

        // Move o ponto em uma direção NO NE SO SE
        System.out.println("\n------------------------------");
        System.out.println("Move o ponto em uma direção");

        System.out.print(p1 + " sudeste => ");
        p1.incDiag("sudeste");
        System.out.print(p1 + "\n");

        System.out.print(p1 + " sudoeste => ");
        p1.incDiag("sudoeste");
        System.out.print(p1 + "\n");
    }
}
