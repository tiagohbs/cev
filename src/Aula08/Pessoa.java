package Aula08;
class Pessoa {
    private String pessoa, sexo;
    private int idade;

    public void fazerAniver(){
        this.setIdade(getIdade()+1);

    }

    public Pessoa(String pessoa, int idade,String sexo ) {
        this.pessoa = pessoa;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
