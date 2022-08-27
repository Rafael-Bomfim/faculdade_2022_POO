package br.edu.fatecfranca.lista1.exe02;
public class Cliente {
    public int nroConta, nroAgencia;
    public String nome;
    public double saldo;
    
    public Cliente(){
        
    }
    
    public Cliente(int nroConta, int nroAgencia, String nome, double saldo){
        this.nroConta = nroConta;
        this.nroAgencia = nroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public void depositar(double x){
        this.saldo += x;
    }
    
    public void sacar(double x){
        if(this.saldo >= x){
            this.saldo -= x;
        }
        else{
            System.out.println("Saldo indisponível!!");
        }
    }
    
    public String paraString(){
        return "Nome: " + this.nome 
               + "\n" + 
               "Número da conta: " + this.nroConta 
               + "\n" + 
               "Numero da Agência: " +  this.nroAgencia 
               + "\n" +
               "Saldo: " + this.saldo 
               + "\n";
    }
}
