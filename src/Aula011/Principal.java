package Aula011;

public class Principal {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        //v1.setNome("Juvelan");
        // v1.setIdade(22);
        //v1.setSexo("M");

        //System.out.println(v1.toString());

        Aluno n1 = new Aluno();

        n1.setNome("Renata");
        n1.setSexo("Inumano");
        n1.setIdade(1500);
        Bolsista b1 = new Bolsista();
        b1.setNome("Juninho");
        b1.pagarMensalidade();

        n1.pagarMensalidade();


    }
}
