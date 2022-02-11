package entities;

import interfaces.FormaBidimensional;

public class Circulo implements FormaBidimensional {
    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double getArea() {
        return Math.PI * (raio*raio);
    }

    public void describe() {
        System.out.printf("Círculo de raio %f e área %f.\n", this.raio, this.getArea());
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
}
