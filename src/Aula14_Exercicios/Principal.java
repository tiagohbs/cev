package Aula14_Exercicios;

public class Principal {
    public static void main(String[] args) {
        Video [] v = new Video[3];
        v[0]=new Video("Aula 01 pooo");
        v[1]=new Video("Video 2");
        v[2]=new Video("Video 3");
        Gafanhoto [] g= new Gafanhoto[2];

        g[0]=new Gafanhoto("Tiago",28,"M","Kalazarth");
        g[1]=new Gafanhoto("Sara",27,"F","Sarahtinha");
        Visualizacao [] vis = new Visualizacao[3];
        vis[0] = new Visualizacao(g[0],v[2]);
        vis[0].avaliar(87f);

        vis[1] = new Visualizacao(g[0],v[1]);
        vis[1].avaliar(9);
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());


        /*System.out.println("\nVideos-----------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGafanhotos-------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString()); */

    }
}
