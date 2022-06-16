package Aula13_SobreCarga;

public class Principal {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();

        c.reagir("Ola");
        c.reagir("Vai apanhar");
        c.reagir(false);
        c.reagir(12,12);
    }
}
