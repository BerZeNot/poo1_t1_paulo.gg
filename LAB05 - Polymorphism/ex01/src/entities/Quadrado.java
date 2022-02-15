package entities;

import interfaces.FormaBidimensional;

public class Quadrado implements FormaBidimensional {

    private Double lado;

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double getArea() {
        return lado*lado;
    }

    public void describe() {
        System.out.printf("Quadrado de lado %f e área %f.\n", this.lado, this.getArea());
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
}
