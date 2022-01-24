package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContaCorrente {

    public Integer agencia;
    public Integer numero;
    public Integer saldo;
    public Date dataCriacao;
    public Date UltimoUso;
    public List<Cliente> mantenedores = new ArrayList<>();

    public ContaCorrente(Integer agencia, Integer numero, List<Cliente> mantenedores) {
        this.agencia = agencia;
        this.numero = numero;
        this.mantenedores = mantenedores;
    }

    public void depositar(int valor){
        if(valor > 0)
            this.saldo+= valor;
    }

    public void sacar(int valor){
        if(valor > 0 && valor <= this.saldo){
            this.saldo-= valor;
        }
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public Date getUltimoUso() {
        return UltimoUso;
    }

    public List<Cliente> getMantenedores() {
        return mantenedores;
    }


}
