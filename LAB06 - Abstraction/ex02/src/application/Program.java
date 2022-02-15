package application;

import entities.ContaComum;
import entities.ContaCorrente;
import entities.ContaEspecial;

public class Program {

    public static void main(String[] args) {

        ContaCorrente contas[] = new ContaCorrente[4];

        contas[0] = new ContaComum(10, 10001, 192123);
        contas[1] = new ContaComum(350, 10002, 24444);
        contas[2] = new ContaEspecial(1000, 10003, 14561923, 0);
        contas[3] = new ContaEspecial(4500, 10004, 1923995882, 5000);

        // Transforma uma conta especial em conta comum caso ela tenha limite = 0
        for(int i=0; i<contas.length; i++){
            if(contas[i] instanceof ContaEspecial && ((ContaEspecial) contas[i]).getLimite() == 0){
                contas[i] = ((ContaEspecial) contas[i]).toContaComum();
            }
        }

        for(ContaCorrente cc : contas){
            if(cc instanceof ContaComum)
                System.out.println("Conta " + cc.getNumConta() + " é conta comum!");

            else if(cc instanceof ContaEspecial)
                System.out.println("Conta " + cc.getNumConta() + " é conta especial!");
        }




    }
}
