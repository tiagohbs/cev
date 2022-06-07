package Aula05;

import java.util.Random;

public class Aula05 {
    public static void main(String[] args) {
        Random random = new Random();
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(random.nextInt(1,50));
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(100);
        p1.sacar(150);
        p1.fecharConta();
        System.out.println("==========");
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(random.nextInt(1,50));
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(501);
        p2.sacar(1500);



        p1.estadoAtual();
        p2.estadoAtual();
    }
}
