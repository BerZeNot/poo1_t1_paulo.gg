public class Veiculo {
    private String marca;
    private String placa;
    private Integer kilometragem;

    private Integer velocidadeAtual;

    private Integer velocidadeMaxima;
    public Veiculo(){
    }

    public Veiculo(String marca, String placa, Integer kilometragem, Integer velocidadeMaxima){
        this.marca = marca;
        this.placa = placa;
        this.kilometragem = kilometragem;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
    }

    public void acelera(){
        if (velocidadeAtual < velocidadeMaxima)
            velocidadeAtual++;

        System.out.println("Velocidade atual: " + velocidadeAtual + " Km/h");
    }

    public void freia(){
        if(velocidadeAtual > 0)
            velocidadeAtual--;
        System.out.println("Velocidade atual: " + velocidadeAtual + " Km/h");
    }
    public Integer getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(Integer kilometragem) {
        this.kilometragem = kilometragem;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getPlaca(){
        return  placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public Integer getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
}