package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Agencia> agencias = new ArrayList<Agencia>();

    public List<Cliente> getClientes() {
        return clientes;
    }

    private List<Cliente> clientes = new ArrayList<>();
    public Banco(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Agencia> getAgencias() {
        return agencias;
    }

    public void cadastrarAgencia(String nome, String cidade, String estado){
        agencias.add(new Agencia(nome, cidade, estado));
    }

    public void cadastrarCliente(Cliente cli){
        clientes.add(cli);
    }

    public String getNome() {
        return nome;
    }
}
