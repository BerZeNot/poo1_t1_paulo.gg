package entities;

public class ContaEspecial extends ContaCorrente {

    private float limite;

    public ContaEspecial(float saldo, int numConta, int senha, float limite) {
        super(saldo, numConta, senha);
        this.limite = limite;
    }

    @Override
    public boolean debitaValor ( float val, int pwd){
        if (isSenha(pwd))
            return ( false ); // senha deve ser válida
        if (super.getEstado(pwd) != 1)
            return ( false); // conta deve ser ativa

        if (val <= 0 )
            return  (false); // val > 0

        if(val > super.getSaldo(pwd) )
            return (false);

        super.setSaldoContaEspecialEspecial(this, (super.getSaldo(pwd) - val));
        return (true);
    }

    public ContaComum toContaComum(){
        ContaComum tmp = super.converterParaContaComum();
        tmp.setLimite(this.limite);
        return tmp;
    }
    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
}
