package Aula14_Exercicios;

public class Video implements AcoesVideo {
    private  String titulo;
    private float avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao=1;
        this.views=0;
        this.curtidas=0;
        this.reproduzindo=false;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        this.reproduzindo=true;
        System.out.println("Reproduzindo video");
    }

    @Override
    public void pause() {
        this.reproduzindo=false;

    }

    @Override
    public void like() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        int nova = (int) ((this.avaliacao + avaliacao) / this.views);
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    @Override
    public String toString() {
        return "Video {" +
                "\ntitulo='" + titulo + '\'' +
                ", \navaliacao=" + avaliacao +
                ", \nviews=" + views +
                ", \ncurtidas=" + curtidas +
                ", \nreproduzindo=" + reproduzindo +
                '}';
    }
}
