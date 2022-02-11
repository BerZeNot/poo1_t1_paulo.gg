package entities;

import interfaces.FormaTridimensional;

public class Esfera implements FormaTridimensional {
    private Double raio;

    public Esfera(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double getArea() {
        return (4 * Math.PI * (raio*raio));
    }

    @Override
    public Double getVolume() {
        return ((4/3) * Math.PI * (raio*raio*raio));
    }

    public void describe() {
        System.out.printf("Esfera de raio %f, área %f e volume %f.\n", this.raio, this.getArea(), this.getVolume());
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
}
