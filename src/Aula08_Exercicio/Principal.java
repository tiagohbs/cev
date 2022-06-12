package Aula08_Exercicio;

public class Principal {
    public static void main(String[] args) {
        Pessoaa[] p = new Pessoaa[2];
        Livroo[] l=new Livroo[3];

        //Pessoa
        p[0] = new Pessoaa("João",22,"M");
        p[1]= new Pessoaa("Maria",13,"F");
        //Livro
        l[0]=new Livroo("Cronicas","Tiago Silva",300,p[0]);
        l[1]=new Livroo("Fim do Mundo","Sara Limeira",1500,p[1]);
        l[2]=new Livroo("Cozinhar","Sara Limeira",2000,p[0]);

        l[1].abrir();
        l[1].folhear(240);
        l[1].avancarPag();
        System.out.println(l[1].detalhes());
    }

}
