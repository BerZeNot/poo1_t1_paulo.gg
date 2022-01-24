package entities;

public class Ponto {
    private int x;
    private int y;

    /**
     * Construtor padrão, sem passagem de valores por parâmetro, para caso seja necessário
     * instanciar um ponto sem informar os valores de x e y;
      */
    public Ponto() {
    }

    /**
     * Construtor com passagem dos valores de x e y por parâmetro, para caso seja necessário
     * instanciar as variáveis logo que o objeto for instanciado
     * @param x posição do ponto no eixo x do plano cartesiano
     * @param y posição do ponto no eixo y do plano cartesiano
     */
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
