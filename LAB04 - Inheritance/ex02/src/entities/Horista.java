package entities;

import java.util.Date;

public class Horista extends Funcionario{

    private Integer horasTrabalhadas;
    private Double valorPorHora;

    public Horista(String nome, Date dataNascimento, Double valorPorHora, Integer horasTrabalhadas) {
        super(nome, dataNascimento, valorPorHora * horasTrabalhadas);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public String getInfo(){
        String info = super.getInfo();
        info += " - Valor por hora: " + this.valorPorHora;
        info += " - Horas trabalhadas: " + this.horasTrabalhadas;
        return info;
    }
}
