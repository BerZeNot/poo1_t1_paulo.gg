package entities;

public class Ponto {
    private double x;
    private double y;

    public Ponto() {
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void imprimePonto(){
        System.out.printf("(%.0f,%.0f)", x, y);
    }

    public static Ponto somaPontos(Ponto p1, Ponto p2){
        Ponto tmp = new Ponto();
        tmp.setX(p1.getX() + p2.getX());
        tmp.setY(p1.getY() + p2.getY());
        return tmp;
    }

    public static void somaPontos(Ponto p1, Ponto p2, Ponto pResult){
        if(pResult != null) {
            pResult.setX(p1.getX() + p2.getX());
            pResult.setY(p1.getY() + p2.getY());
        }
    }

    public static double calcArea(Ponto p1, Ponto p2){
        return 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
