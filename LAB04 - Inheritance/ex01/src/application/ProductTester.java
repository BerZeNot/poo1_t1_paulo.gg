package application;

import entities.Produto;
import entities.ProdutoComPreco;
import entities.ProdutoPerEsp;
import entities.ProdutoPerecivel;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProductTester {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Produto p1 = new Produto(1000, "Óleo de soja", 320);
        Produto p2 = new ProdutoComPreco(1001, "Banana Prata", 288, 2.99);
        Produto p3 = new ProdutoPerecivel(1003,
                "Ovo de codorna",
                478,
                new Date("04/02/2022"));
        Produto p4 = new ProdutoPerEsp(1004, "QUeijo Minas Teco", 120, new Date(2022, 10, 23));


        // Teste produto p1
        System.out.println("\n<< Teste Produto p1 >>");
        System.out.println("Código: " + p1.getCodigo());
        System.out.println("Descrição: " + p1.getDescricao());
        System.out.println("Quantidade em estoque: " + p1.getQuantidade());
        System.out.println("Decrementando estoque..");
        System.out.println("Quantidade retirada em estoque: " + p1.decrementarEstoque(300));
        System.out.println("Nova quantidade em estoque: " + p1.getQuantidade());

        // Teste produto p2
        System.out.println("\n<< Teste Produto p2 >>");
        System.out.println("Código: " + p2.getCodigo());
        System.out.println("Descrição: " + p2.getDescricao());
        System.out.println("Preço: R$ " + ((ProdutoComPreco) p2).getPrecoUnitario() );
        System.out.println("Alterando preço..");
        ((ProdutoComPreco) p2).setPrecoUnitario( ((ProdutoComPreco) p2).getPrecoUnitario() + 3.0);
        System.out.println("Novo preço de p2: " + ((ProdutoComPreco) p2).getPrecoUnitario());
        System.out.println("Quantidade em estoque: " + p2.getQuantidade());
        System.out.println("Decrementando estoque..");
        System.out.println("Quantidade retirada em estoque: " + p2.decrementarEstoque(300));
        System.out.println("Nova quantidade em estoque: " + p2.getQuantidade());

        // Teste produto p3
        System.out.println("\n<< Teste Produto p3 >>");
        System.out.println("Código: " + p3.getCodigo());
        System.out.println("Descrição: " + p3.getDescricao());
        System.out.println("Quantidade em estoque: " + p3.getQuantidade());
        System.out.println("Decrementando estoque..");
        int quantidadeParaDecrementar = 300;
        boolean estoqueTotalmenteVendido = false;
        if(quantidadeParaDecrementar >= p3.getQuantidade()){
            estoqueTotalmenteVendido = true;
        }
        int novaQuantidadeEstoqueP3 = ((ProdutoPerecivel)p3).decrementarEstoque(quantidadeParaDecrementar, new Date(System.currentTimeMillis()));
        System.out.println("Quantidade retirada em estoque: " + novaQuantidadeEstoqueP3);
        System.out.println("Nova quantidade em estoque: " + p3.getQuantidade());
        if(novaQuantidadeEstoqueP3 == 0 && !estoqueTotalmenteVendido){
            System.out.println("O estoque venceu e foi zerado. Compre novos produtos para o estoque!");
        }
        // Teste produto p4
        System.out.println("\n<< Teste Produto p4 >>");
        System.out.println("Código: " + p4.getCodigo());
        System.out.println("Descrição: " + p4.getDescricao());
        System.out.println("Quantidade em estoque: " + p4.getQuantidade());
        System.out.println("Decrementando estoque..");
        int quantidadeParaDecrementarP4 = 300;
        boolean estoqueTotalmenteVendidoP4 = false;
        if(quantidadeParaDecrementarP4 >= p4.getQuantidade()){
            estoqueTotalmenteVendidoP4 = true;
        }
        int novaQuantidadeEstoqueP4 = ((ProdutoPerEsp)p4).decrementarEstoque(quantidadeParaDecrementarP4, new Date(System.currentTimeMillis()));
        System.out.println("Quantidade retirada em estoque: " + novaQuantidadeEstoqueP3);
        System.out.println("Nova quantidade em estoque: " + p4.getQuantidade());
        if(novaQuantidadeEstoqueP4 == 0 && !estoqueTotalmenteVendidoP4){
            System.out.println("O estoque venceu e foi zerado. Compre novos produtos para o estoque!");
        }

        ((ProdutoPerEsp) p4).imprimeDados();

    }
}
