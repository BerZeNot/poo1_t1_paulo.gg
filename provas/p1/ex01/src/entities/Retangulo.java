package entities;

import java.security.InvalidParameterException;

public class Retangulo {
    private Ponto p1;
    private Ponto p2;

    /**
     * Construtor que permite passar 4 valores inteiros que representam as coordenadas
     * das extremidades do retângulo
     * @param x1 x do ponto 1
     * @param y1 y do ponto 1
     * @param x2 x do ponto 2
     * @param y2 y do ponto 2
     */
    public Retangulo(int x1, int y1, int x2, int y2) throws InvalidParameterException{
        if(x1 == x2 || y1 == y2){
            throw new InvalidParameterException("Os pontos de mesmo eixo (x ou y) não podem ter o mesmo valor");
        } else {
            this.p1 = new Ponto(x1, y1);
            this.p2 = new Ponto(x2, y2);
        }
    }

    /**
     * Construtor que permite a instanciação de um retângulo passando dois pontos já instanciados
     * @param p1 Ponto 1
     * @param p2 Ponto 2
     * @throws InvalidParameterException
     */
    public Retangulo(Ponto p1, Ponto p2) throws InvalidParameterException {
        if(p1.getX() == p2.getX() || p1.getY() == p2.getY()){
            throw new InvalidParameterException("Os pontos de mesmo eixo (x ou y) não podem ter o mesmo valor");
        } else {
            this.p1 = p1;
            this.p2 = p2;
        }
    }

    @Override
    public String toString(){
        return "P1:(" + p1 + "), P2(" + p2 + ")";
    }

    public int getArea(){
        int area = (p2.getX() - p1.getX()) * (p2.getY() - p1.getY());
        return Math.abs(area);
    }

    public Ponto getP1() {
        return p1;
    }

    public void setP1(Ponto p1) {
        this.p1 = p1;
    }

    public Ponto getP2() {
        return p2;
    }

    public void setP2(Ponto p2) {
        this.p2 = p2;
    }
}
