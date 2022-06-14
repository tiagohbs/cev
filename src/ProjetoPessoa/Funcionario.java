package ProjetoPessoa;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho(){
        if (this.trabalhando){
            this.trabalhando=!this.trabalhando;
            System.out.println("Escolhendo outra função");
        }else{
            System.out.println("Atualmente sem função");
        }
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
