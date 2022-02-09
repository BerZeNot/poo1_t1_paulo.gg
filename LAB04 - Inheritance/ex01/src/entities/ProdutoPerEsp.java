package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoPerEsp extends ProdutoPerecivel {

    public ProdutoPerEsp(int codigo, String descricao, int quantidade, Date dataVencimento) {
        super(codigo, descricao, quantidade, dataVencimento);
    }

    public void imprimeDados() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder();
        sb.append("Código: " + super.codigo);
        sb.append("\nDescrição: " + super.descricao);
        sb.append("\nQuantidade em estoque: " + quantidade);
        sb.append("\nData de validade: " +  sdf.format(dataVencimento));

        System.out.println(sb.toString());
    }
}
