package entities;

public class Produto {
    protected int codigo;
    protected String descricao;
    protected int quantidade;

    public Produto(int codigo, String descricao, int quantidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public void incrementarEstoque(int quantidade) throws IllegalArgumentException{
        if(quantidade <= 0)
            throw new IllegalArgumentException();
        else
            this.quantidade += quantidade;
    }

    /**
     * Decrementa o estoque e retorna 0 em casos de sucesso.
     * Caso a quantidade a ser retirada, passada por parâmetro, seja maior que
     * a quantidade em estoque, o retorno da função será o valor que foi de fato
     * retirado do estoque.
     *
     *  @param quantidade - quantidade a ser retirada do estoque
     * @return 0 em casos de sucesso ou um Inteiro maior que zero em casos em que a quantidade a ser retirada é maior que a quantidade em estoque
     * @throws IllegalArgumentException será lançada caso o valor informado para o parâmetro quantidade seja menor ou igual a 0
     */
    public int decrementarEstoque(int quantidade) throws IllegalArgumentException{
        if( quantidade <= 0)
            throw new IllegalArgumentException();
        else if(quantidade > this.quantidade){
            int quantidadeRealRetirada = this.quantidade;
            this.quantidade -= this.quantidade;
            return quantidadeRealRetirada;
        } else {
            this.quantidade -= quantidade;
            return quantidade;
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
