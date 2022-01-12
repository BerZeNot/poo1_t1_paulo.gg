package application;

import entities.Cliente;
import entities.Funcionario;
import entities.Produto;

import java.util.Date;

public class ProgramCadastro {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("133.133.133-13", "Adamastor", "24/09/1979", "11111-111");
        Funcionario f1 = new Funcionario("122.122.122-12", "Bruno", "06/09/1989", "05/07/2009");
        Produto p1 = new Produto(1000, "Notebook Gamer", "Asus", 6900.00);

        System.out.println("Cliente cadastrado: ");
        c1.getInfo();
        System.out.println("________________________________");

        System.out.println("Funcionário cadastrado: ");
        f1.getInfo();
        System.out.println("________________________________");

        System.out.println("Produto cadastrado: ");
        p1.getInfo();
    }
}
