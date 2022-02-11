package entities;

import interfaces.FormaBidimensional;

public class Triangulo implements FormaBidimensional {

    private Double base;
    private Double altura;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double getArea() {
        return ((base*altura)/2);
    }

    public void describe() {
        System.out.printf("Triângulo de base %f, altura %f e área %f.\n", this.base, this.altura, this.getArea());
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
