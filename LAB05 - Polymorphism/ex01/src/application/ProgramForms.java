package application;

import entities.*;
import interfaces.Forma;
import interfaces.FormaTridimensional;

public class ProgramForms {

    public static void main(String[] args) {
        Forma formas[] = new Forma[6];
        formas[0] = new Circulo(2.0);
        formas[1] = new Quadrado(4.0);
        formas[2] = new Triangulo(2.0, 3.2);
        formas[3] = new Esfera(5.0);
        formas[4] = new Cubo(4.5);
        formas[5] = new Tetraedro(3.0);

        System.out.println("<< Áreas (e volumes se for o caso) >>");

        for(int i=0; i<formas.length; i++) {
            System.out.printf("formas[%d] - area: %f", i, formas[i].getArea());

            if(formas[i] instanceof FormaTridimensional)
                System.out.printf(" volume: %f", ((FormaTridimensional) formas[i]).getVolume());

            System.out.println("\n");
        }


        System.out.println("<< Descrição textual >>");
        for (Forma f : formas){
            f.describe();
        }


    }
}
