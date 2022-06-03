package Aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){


        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.isStatus());
        System.out.println("---------");
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t=="CC")this.setSaldo(50);
        else if( t == "CP")
            this.setSaldo(150);
        System.out.println("Conta Aberta com sucesso!");
    }



    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro, impossivel fechar");
        }else if (saldo < 0){
            System.out.println("Conta em débito, impossivel fechar");
            }
        else{
            System.out.println("A Conta foi encerrada");
            this.setStatus(false);
        }
        }


    public void depositar(float v){
        if (this.isStatus()== true){
            //saldo=saldo+v; formar diferentes de puxar o valor da variavel ou objeto
            //saldo+=v;
            //this.saldo+=v;
            this.setSaldo(getSaldo()+v);
            System.out.println("Deposito realizado na conta: "+this.getDono());

        }else{
            System.out.println("Impossivel depositar em conta inexistente");
        }
    }


    public void sacar(float sc){
        if (isStatus()){
            if(getSaldo()>=sc){
             this.setSaldo((this.getSaldo()-sc));
                System.out.println("Saque realizado na conta: "+this.getDono());
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel sacar em conta inexistente");
        }

    }


    public void pagarMensal(){
        float v=0;
        if (this.getTipo() =="CC"){
            v=12;
        }else if(this.getTipo() =="CP"){
            v=20;
        }
        if(this.isStatus()){
            if(this.getSaldo()>v) {
                //setSaldo(getSaldo() - v);
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Mensalidade paga com sucesso por : "+this.getDono());
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel pagar");
        }
    }


    public  ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }


    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(){
        return numConta;
    }



    public void setTipo(String t){
        this.tipo =t;
    }
    public String getTipo(){
        return tipo;
    }



    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return dono;
    }


    public void setSaldo(float s){
        this.saldo = s;
    }
    public float getSaldo(){
        return saldo;
    }


    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean st) {
        this.status = st;
    }


}


