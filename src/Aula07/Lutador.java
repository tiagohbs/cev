package Aula07;

 class Lutador {
     private String nome;
     private String nacionalidade;
     private int idade;
     private float altura;
     private float peso;
     private String categoria;
     private int vitorias;
     private int derrotas;
     private int empates;


     public void apresentar(){

     }
     public void status(){

     }
     public void ganharLuta(){

     }
     public  void perderLuta(){

     }
     public void empatarLuta(){

     }

     public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
         this.nome = no;
         this.nacionalidade = na;
         this.idade = id;
         this.altura = al;
        // this.setPeso(pe);
         this.vitorias = vi;
         this.derrotas = de;
         this.empates = em;
     }
 }
