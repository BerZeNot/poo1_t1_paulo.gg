package entities;

import interfaces.FormaTridimensional;

public class Tetraedro implements FormaTridimensional {

    private Double aresta;

    public Tetraedro(Double aresta) {
        this.aresta = aresta;
    }

    @Override
    public Double getArea() {
        return (Math.pow(aresta,2.0) * Math.sqrt(3));
    }

    @Override
    public Double getVolume() {
        return (Math.pow(aresta,3) * (Math.sqrt(2)/12));
    }

    public void describe() {
        System.out.printf("Tetraedro de aresta %f, área %f e volume %f.\n", this.aresta, this.getArea(), this.getVolume());
    }

    public Double getAresta() {
        return aresta;
    }

    public void setAresta(Double aresta) {
        this.aresta = aresta;
    }
}
