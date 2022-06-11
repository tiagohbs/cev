package Aula06;

public class ControleRemoto implements Controlador{
    int volume;
    boolean ligado;
    boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int v) {
        this.volume = v;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desLigar() {

        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-------MENUS-------");
        System.out.println("Esta ligado? "+this.isLigado());
        System.out.println("Esta tocando? "+this.isTocando());
        System.out.println("Volume: "+this.getVolume());
        for (int i = 0; i<= this.getVolume();i+=10)
            System.out.print("||");
    }

    @Override
    public void fecharMenu() {
        System.out.println("\nFechando Menu...");

    }

    @Override
    public void maisVolume() {
        if (this.isLigado()){
            this.setVolume(getVolume()+5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()){
            this.setVolume(getVolume()-5);
        }

    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && (this.getVolume() > 0)){
            this.setVolume(0);
        }
        System.out.println("Mudo ligado!");
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && (this.getVolume() == 0)){
            this.setVolume(50);
        }
        System.out.println("Mudo desligado...");
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando()))
            this.setTocando(true);

    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }

    }
}
