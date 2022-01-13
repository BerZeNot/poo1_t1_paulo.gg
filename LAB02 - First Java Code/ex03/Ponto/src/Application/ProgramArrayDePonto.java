package Application;

import entities.Ponto;

import java.util.Locale;
import java.util.Scanner;

public class ProgramArrayDePonto {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos pontos deseja cadastrar?: ");
        int qtd = sc.nextInt();
        Ponto[] pontos = new Ponto[qtd];

        int left=0, right=0, top=0, bottom=0;
        double x,y;
        for(int i=0; i < qtd; i++){
            System.out.println("Dados do ponto " + (i+1));
            System.out.print("Informe x: ");
            x = sc.nextDouble();
            System.out.print("Informe y: ");
            y = sc.nextDouble();

            pontos[i] = new Ponto(x,y);
            if(i>0){
                if(pontos[i].getX() < pontos[left].getX())
                    left = i;

                if(pontos[i].getX() > pontos[right].getX())
                    right = i;

                if(pontos[i].getY() < pontos[bottom].getY())
                    bottom = i;

                if(pontos[i].getY() > pontos[top].getY())
                    top = i;
            }
        }

        System.out.println("O ponto mais à esquerda é: " +  pontos[left]);
        System.out.println("O ponto mais à direita é: " + pontos[right]);
        System.out.println("O ponto mais à cima é: " + pontos[top]);
        System.out.println("O ponto mais à baixo é: " + pontos[bottom]);

    }
}
