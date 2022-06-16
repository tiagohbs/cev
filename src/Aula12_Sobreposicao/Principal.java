package Aula12_Sobreposicao;

public class Principal {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Peixe p = new Peixe();

        p.setIdade(23);p.emitirSom();

        m.emitirSom();

        System.out.println(m.toString());
        System.out.println(p.toString());

    }
}
