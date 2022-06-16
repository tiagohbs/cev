package Aula13_SobreCarga;

public class Cachorro extends Lobo {
    @Override
    public void emitirSom() {
        System.out.println("Au au auauau");
    }

    public void reagir( String frase){
        if (frase.equals("Ola") || frase.equals("Cheguei")){
            System.out.println("Abanar e latir");
        }else{
            System.out.println("Rosnar");
        }


    }
    public void reagir(int hora, int peso){
        if (hora < 12){
            System.out.println("Abanar o rabo");
        }else if(hora>= 18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Rosnar");
        }
    }


    public void reagir(boolean dono){
        if (dono){
            System.out.println("Abanar");
        }else{
            System.out.println("Latir");
        }
    }
    public void reagir (int idade, float peso ){
        if (idade<5){
            if (peso<10){
                System.out.println("Abanar");

            }else{
                System.out.println("Latir");
            }
        }
        if (peso<10){
            System.out.println("Rosnar");
        }else{
            System.out.println("Ignorar");
        }
    }
}
