package entities;

import java.util.Date;

public class Chefe extends Funcionario {
    public Chefe(String nome, Date dataNascimento, Double salario) {
        super(nome, dataNascimento, salario);
    }

    public String getInfo(){
        String info = super.getInfo();
        return info;
    }
}
