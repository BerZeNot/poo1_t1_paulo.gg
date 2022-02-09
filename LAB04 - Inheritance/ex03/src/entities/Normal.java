package entities;

public class Normal extends Ingresso {

    public Normal(Double valor) {
        super(valor);
    }

    private void tipoIngresso(){
        System.out.println("Ingresso Normal");
    }
}
