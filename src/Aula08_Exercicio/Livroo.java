package Aula08_Exercicio;

public class Livroo implements Publicacaoo {
    private String titulo;
    private String  autor;
    private int totPaginas;
    private int pagAtual=0;
    private boolean aberto=false;
    private Pessoaa leitor;



    public String detalhes() {
        return "Livroo{" +
                "titulo='" + titulo + '\'' +
                ", \nautor='" + autor + '\'' +
                ", \ntotPaginas=" + totPaginas +
                ", \npagAtual=" + pagAtual +
                ", \naberto=" + aberto +
                ", \nleitor=" + leitor.getNome() +
                ", \nIdade= "+leitor.getIdade()+
                ", \nsexo= "+leitor.getSexo()+
                '}';
    }

    public Livroo(String titulo, String autor, int totPaginas, Pessoaa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;

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

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoaa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoaa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto=true;
    }

    @Override
    public void fechar() {
        this.aberto=false;

    }

    @Override
    public void folhear(int p) {
        //this.folhear(p);
        this.pagAtual=p;
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(getPagAtual()+1);

    }

    @Override
    public void voltarPag() {
        this.setPagAtual(getPagAtual()-1);
    }
}
