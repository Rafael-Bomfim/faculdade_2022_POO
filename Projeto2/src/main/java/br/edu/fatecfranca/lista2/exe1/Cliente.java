package br.edu.fatecfranca.lista2.exe1;

public final class Cliente {
    private String nroConta, nroAgencia, nome; //criação de atributos para encapsulamentos
    private float saldo;
    
    public Cliente(){ //método constutor vazio
        
    }
    //método construtor com parametros
    public Cliente(String nroConta, String nroAgencia, String nome, float saldo){
        this.setNome(nome);
        this.setNroAgencia(nroAgencia);
        this.setNroConta(nroConta);
        this.setSaldo(saldo);
    }
    //setters void e recebe parametros
    public void setNroConta(String nroConta){
        if (nroConta.length() == 8){
            if (nroConta.charAt(6) == '-'){
                this.nroConta = nroConta;
            }
            else System.out.println("Dígito verificado ausente ou em posição errada");
        }
        else System.out.println("Tamanho inválido");
    }
    
    public void setNroAgencia(String nroAgencia){
        if (nroAgencia.length() == 6){
            if (nroAgencia.charAt(4) == '-'){
                this.nroAgencia = nroAgencia;
            }
            else System.out.println("Dígito verificado ausente ou em posição errada");
        }
        else System.out.println("Tamanho inválido");
    }
    
    public void setNome(String nome){
        if (nome.length() <= 30) 
            this.nome = nome;
        else System.out.println("Tamanho inválido"); 
    }
    
    public void setSaldo(float saldo){
        if (saldo >= 0)
           this.saldo = saldo;
        else System.out.println("Saldo não pode ser negativo");
    }
    //getters tipo da variável e não recebe parametros
    public String getNroConta(){
        return this.nroConta;
    }
    
    public String getNroAgencia(){
        return this.nroAgencia;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    //métodos 
    public void sacar(float x){
        this.setSaldo(this.saldo - x);
    }
    
    public void depositar(float x){
        this.saldo += x;
    }
    
    public void mostrar(){
        System.out.println("Conta: " + this.nroConta + "\n" + "Agência: " + this.nroAgencia +
                "\n" + "Nome: " + this.nome + "\n" + "Saldo: " + this.saldo + "\n");
    }
}
