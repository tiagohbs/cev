package Aula011_Heranca;

public class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa(){

    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome()+" é Bolsista pagando mensalidade");

    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
