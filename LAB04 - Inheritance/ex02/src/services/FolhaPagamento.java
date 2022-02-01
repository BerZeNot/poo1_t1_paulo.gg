package services;

import entities.Funcionario;

public class FolhaPagamento {

    public static void gerarFolhaDePagamento(Funcionario funcionarios[]){
        StringBuilder sb = new StringBuilder();
        Double salarioTotal = 0.0;
        sb.append("Relatório de funcionários: \n");
        sb.append("_________________________________________________________\n");
        for (Funcionario f : funcionarios){
            sb.append(f.getInfo() + "\n");
            salarioTotal += f.getSalario();
        }
        sb.append("_________________________________________________________\n");
        sb.append(String.format("Valor total de salários: R$ %.2f", salarioTotal));

        System.out.println(sb.toString());
    }
}
