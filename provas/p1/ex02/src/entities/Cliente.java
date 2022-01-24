package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private Date dataDeNascimento;
    private String endereco;
    private String cidade;
    private String estado;
    private Gerente gerente;
    private List<ContaCorrente> contasCorrente = new ArrayList<ContaCorrente>();

    public Cliente(String nome, String cpf, Date dataDeNascimento, String endereco, String cidade, String estado, Gerente gerente) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.gerente = gerente;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarContaCorrente(ContaCorrente cc){
        contasCorrente.add(cc);
    }

    public void removerContaCorrente(ContaCorrente cc){
        ContaCorrente contaParaRemover = null;
        for(ContaCorrente c : contasCorrente){
            if (c.equals(cc)){
                contaParaRemover = c;
            }
        }
        if (contaParaRemover!=null)
            contasCorrente.remove(contaParaRemover);
    }
    public String getCpf() {
        return cpf;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public List<ContaCorrente> getContasCorrente() {
        return contasCorrente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
}
