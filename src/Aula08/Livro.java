package Aula08;

public class Livro implements Publicacao {
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    /*public void detalhers(){
        System.out.println("O Título do livro é "+this.getTitulo());
        System.out.println("O Autor é "+this.getAutor());
        System.out.println("Este livro contém "+this.getTotPaginas()+" paginas.");

    }*/


    public String detalhes() {
        return "Livro{" +
                "titulo= '" + titulo + '\'' +
                ", \nautor= '" + autor + '\'' +
                ", \ntotPaginas= " + totPaginas +
                ", \npagAtual= " + pagAtual +
                ", \naberto= " + aberto +
                ", \nleitor= " + leitor.getPessoa() +
                ", \n Sexo= "+ leitor.getSexo()+
                ", \n Idade= "+ leitor.getIdade()+
                '}';
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto=false;
        this.pagAtual=0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto= true;

    }

    @Override
    public void fechar() {
        this.aberto =false;
    }

    @Override
    public void folhear(int p) {
        this.pagAtual= p;

    }

    @Override
    public void avancarPagina() {
        this.pagAtual++;
    }

    @Override
    public void voltarPagina() {
        this.pagAtual--;
    }
}