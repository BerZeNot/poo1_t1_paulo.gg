package entities;

import java.util.Date;

public class ProdutoPerecivel extends Produto {
    private static final Long TWO_MONTHS_IN_MS = (long) 1000*60*60*24*60;

    protected Date dataVencimento;

    public ProdutoPerecivel(int codigo, String descricao, int quantidade, Date dataVencimento) {
        super(codigo, descricao, quantidade);
        this.dataVencimento = dataVencimento;
    }

    @Override
    public void incrementarEstoque(int quantidade){
        if (this.quantidade == 0){
            this.quantidade = quantidade;
        }
    }

    public int decrementarEstoque(int quantidade, Date diaCorrente){
        if( (diaCorrente.getTime() - this.dataVencimento.getTime()) > TWO_MONTHS_IN_MS){
            super.decrementarEstoque(super.getQuantidade());
            return 0;
        } else {
            return super.decrementarEstoque(quantidade);
        }
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }
}
