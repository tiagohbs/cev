package Aula12_Sobreposicao;

import java.util.Random;

public abstract class Animal {
    Random r = new Random(999999);
    protected float peso;
    protected int idade;
    protected int membros;

    @Override
    public String toString() {
        return "Dados {" +
                "peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                ", Id: "+this.identificacao()+
                '}';
    }

    public int identificacao(){

        return r.nextInt();
    }
    public abstract void locomover();

    public abstract void alimentar();

    public abstract void emitirSom();





    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
}
