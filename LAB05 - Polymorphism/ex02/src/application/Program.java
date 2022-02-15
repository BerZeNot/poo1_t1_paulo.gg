package application;

import entities.Atendente;
import entities.Funcionario;
import entities.Piloto;

public class Program {

    public static void main(String[] args) {
        Funcionario funcionarios[]  = new Funcionario[2];
        funcionarios[0] = new Atendente("Larrisa Maria", "133.123.456-75", "MG-14.452-419", 23, 1201549);
        funcionarios[1] = new Piloto("Alan Sousa", "127.123.157-12", "SP-17-127-192", 37, 41215123, 49);

        for(Funcionario f :funcionarios){
            System.out.println(f);
            System.out.println("Salário total: " + f.calculaSalario());
        }
    }
}

