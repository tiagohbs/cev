package Aula08;

public class Aula08 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        p[0]=new Pessoa("Pedro",22,"M");
        p[1]=new Pessoa("Maria", 5,"F");
        l[0]=new Livro("Aprendendo Java","José da silva",300,p[0]);
        l[1]=new Livro("Poo para iniciantes","Pedro Paulo",500,p[1]);
        l[2]=new Livro("Java avançado", "Maria",800,p[0]);
        System.out.println(l[0].detalhes());
    }
}
