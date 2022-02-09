package application;

import entities.*;
import services.FolhaPagamento;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Empresa {
    public static void main(String[] args) {
        Funcionario chefe = new Chefe( "Marcos Alcântara", new Date("10/10/1979"), 4580.00);

        Funcionario vendedor1 = new Vendedor("Clênio Sílva", new Date("05/02/1993"), 1500.00, 40.00, 35);
        Funcionario vendedor2 = new Vendedor("Bruce Costa", new Date("15/07/1986"), 1600.00, 42.00, 27);
        Funcionario vendedor3 = new Vendedor("Daniele Oliveira", new Date("18/09/1989"), 1700.00, 45.00, 42);

        Funcionario operario1 = new Operario("Gláuber Watson",new Date("11/02/1969"), 45.10, 103 );
        Funcionario operario2 = new Operario("Olga Gorbatchov", new Date("10/05/2000"), 35.10, 89);

        Funcionario horista1 = new Horista("Orácio Octavius", new Date("02/04/1999"), 15.0, 160);
        Funcionario horista2 = new Horista("Wander Gonçales", new Date("04/05/2002"), 19.20, 120);

        Funcionario funcionarios[] = new Funcionario[8];

        funcionarios[0] = chefe;
        funcionarios[1] = vendedor1;
        funcionarios[2] = vendedor2;
        funcionarios[3] = vendedor3;
        funcionarios[4] = operario1;
        funcionarios[5] = operario2;
        funcionarios[6] = horista1;
        funcionarios[7] = horista2;

        FolhaPagamento.gerarFolhaDePagamento(funcionarios);

    }
}
