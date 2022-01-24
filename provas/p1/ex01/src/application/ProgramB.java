package application;

import entities.Retangulo;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos retângulos deseja analisar? ");
        int n = sc.nextInt();

        Retangulo[] retangulos = new Retangulo[n];

        for(int i=0; i<n; i++){

            System.out.println("<< Dados do retângulo " + (i+1) + " >>");
            System.out.print("Informe x1: ");
            int x1 = sc.nextInt();
            System.out.print("Informe y1: ");
            int y1 = sc.nextInt();

            System.out.print("Informe x2: ");
            int x2 = sc.nextInt();
            System.out.print("Informe y2: ");
            int y2 = sc.nextInt();

            retangulos[i] = new Retangulo(x1, y1, x2, y2);
        }

        Retangulo biggestArea = retangulos[0];
        int cont=1;
        for(Retangulo r : retangulos){
            System.out.println("-------------------------------");
            System.out.println("Retângulo " + cont);
            System.out.println("p1: " + r.getP1());
            System.out.println("p2: " + r.getP2());
            if(r.getArea() > biggestArea.getArea())
                biggestArea = r;
            cont++;
        }
        System.out.println("O retângulo de maior área é: " + biggestArea);
        System.out.println("Com área de " + biggestArea.getArea());
    }
}
