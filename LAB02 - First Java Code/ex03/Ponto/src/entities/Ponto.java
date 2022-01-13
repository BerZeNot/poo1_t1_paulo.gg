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
        if(p1.getX() != p2.getX() && p1.getY() != p2.getY()){
            double area = (p2.getX() - p1.getX()) * (p2.getY() - p1.getY());
            return Math.abs(area);
        } else {
            System.out.println("Os pontos informados não formam um retângulo!");
            return -1;
        }
    }

    public static void multiplicaPorConstante(Ponto p,double constante){
        p.setX(p.getX() * constante);
        p.setY(p.getY() * constante);
    }

    public void incDir(char dir){
        if (dir == 'n' || dir == 'N')
            this.y++;
        else if(dir == 's' || dir == 'S')
            this.y--;
        else if(dir == 'l' || dir == 'L')
            this.x++;
        else if(dir == 'o' || dir == 'O')
            this.x--;
    }

    public void incDiag(String dir){
        if (dir.equals("nordeste")){
            this.x++;
            this.y++;
        }
        else if(dir.equals("noroeste")){
            this.x--;
            this.y++;
        }
        else if(dir.equals("sudeste")){
            this.x++;
            this.y--;
        }
        else if(dir.equals("sudoeste")) {
            this.x--;
            this.y--;
        }
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
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
