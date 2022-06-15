package Aula011;

public class Tecnico extends Aluno{
    private String cursoTec;
    private int duracaoCurso;

    public String getCursoTec() {
        return cursoTec;
    }

    public void setCursoTec(String cursoTec) {
        this.cursoTec = cursoTec;
    }

    public int getDuracaoCurso() {
        return duracaoCurso;
    }

    public void setDuracaoCurso(int duracaoCurso) {
        this.duracaoCurso = duracaoCurso;
    }
}
