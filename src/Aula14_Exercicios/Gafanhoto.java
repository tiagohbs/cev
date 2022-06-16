package Aula14_Exercicios;

public class Gafanhoto extends Pessoa {
    private String loguin;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String loguin) {
        super(nome, idade, sexo);
        this.loguin=loguin;
        this.totAssistido=0;
    }

    public void viuMaisUm(){
        this.totAssistido++;
    }



    public String getLoguin() {
        return loguin;
    }

    public void setLoguin(String loguin) {
        this.loguin = loguin;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{ " +super.toString()+// aqui chama os dados da super classe
                " loguin='" + loguin + '\'' +
                ", totAssistido=" + totAssistido +
                '}';
    }
}
