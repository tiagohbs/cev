package Aula011_Heranca;

public class Professor extends Pessoa {
    private String materia;


    @Override
    public void pagarMensalidade() {

    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
