package model.application;

import model.entities.Cliente;
import model.entities.Produto;
import model.entities.Servico;

import static model.utils.Classificador.ordena;

public class Program {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Yorick da Silva", "122.122.122.12", "40038933");
        Cliente c2 = new Cliente("Amanda Glasc", "133.133.133.13", "40028922");
        Cliente c3 = new Cliente("Twisted Fate", "144.144.144.14", "40048944");

        Cliente clientes[] = new Cliente[]{c1,c2,c3};

        Produto p1 = new Produto(1001, "Notebook Alienware", 7999.90);
        Produto p2 = new Produto(1022, "Mousepad Ergonômico", 19.90);
        Produto p3 = new Produto(1013, "Monitor Samsung Odyssey", 4999.90);

        Produto produtos[] = new Produto[]{p1,p2,p3};

        Servico s1 = new Servico("Formatação de computador/notebook",
                "Formatação e instalação de programas",
                120.00);

        Servico s2 = new Servico("Criação de landing page",
                "Criação de landing pages diversas",
                1000.00);

        Servico s3 = new Servico("Correção de bugs de Sistemas",
                "Correção de bugs diversos em sistemas de informação, sites, aplicativos",
                1400.00);

        Servico servicos[] = new Servico[]{s1,s2,s3};

        ordena(clientes);
        ordena(produtos);
        ordena(servicos);

        System.out.println("<< Clientes ordenados >>");
        for(Cliente c : clientes)
            System.out.println(c);

        System.out.println("<< Produtos ordenados >>");
        for(Produto p : produtos)
            System.out.println(p);

        System.out.println("<< Serviços ordenados >>");
        for(Servico s : servicos)
            System.out.println(s);

    }
}
