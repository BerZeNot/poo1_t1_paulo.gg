package entities;

import interfaces.FormaTridimensional;

public class Cubo implements FormaTridimensional {

    private Double lado;

    public Cubo(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double getArea() {
        return (6 * (lado*lado));
    }

    @Override
    public Double getVolume() {
        return (lado*lado*lado);
    }

    public void describe() {
        System.out.printf("Cubo de lado %f, área %f e volume %f.\n", this.lado, this.getArea(), this.getVolume());
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
}
