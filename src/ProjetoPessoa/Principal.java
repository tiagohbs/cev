package ProjetoPessoa;

import Aula08_Exercicio.Pessoaa;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        p2.setCurso(" Informatica ");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        p3.receberAumento(9000f);
        p4.mudarTrabalho();
        p2.cancelarMatr();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
