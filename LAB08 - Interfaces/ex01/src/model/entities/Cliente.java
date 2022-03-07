package model.entities;

import model.interfaces.Classificavel;

import java.util.Objects;

public class Cliente implements Classificavel {

    private String nome;
    private String cpf;
    private String telefone;

    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    @Override
    public boolean eMenorQue(Classificavel obj) {
        int smallerName = (this.nome.length() <= ((Cliente)obj).getNome().length())
                ? this.nome.length()
                : ((Cliente)obj).getNome().length();

        for(int i=0; i<smallerName; i++){
            if(this.nome.charAt(i) < ((Cliente)obj).getNome().charAt(i) ){
                return true;
            }
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return nome.equals(cliente.nome) && cpf.equals(cliente.cpf) && telefone.equals(cliente.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, telefone);
    }
}
