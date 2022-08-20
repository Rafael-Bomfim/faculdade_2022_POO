package br.edu.fatecfranca.projeto1.exe0;
public class Carro {
    
    public String marca, modelo;
    public double velAtual;
    public boolean statusMotor;//true or false
    
    //crie os dois construtores da classe carro
    
    public Carro() {
        
    }
    
    public Carro(String marca, String modelo, double velAtual, 
        boolean statusMotor){
        this.marca = marca;
        this.modelo = modelo;
        this.velAtual = velAtual;
        this.statusMotor = statusMotor;
    }
    
    //faça um método para ligar o motor do carro
    public void ligar(){
        if(!this.statusMotor){
            this.statusMotor = true;
        }
    }
    //faça um metodo para desligar o motor do carro
    public void desligar(){
        if(this.velAtual > 0){
            this.velAtual = 0;
        }
        if(this.statusMotor){
            this.statusMotor = false;        
        }
    }
    
    //faça um método para acelerar o carro de x unidades
    public void acelerar(double x){
        if(!this.statusMotor){
            System.out.println("O carro está desligado");
        }
        else if((this.velAtual + x) >= 80){
            System.out.println("O limite de velocidade de 80km não pode ser ultrapassado");
        }
        else this.velAtual += x;
    }
    
    //faça um método para frear o carro x unidade
    public void desacelerar(double x){
        if(!this.statusMotor){
            System.out.println("O carro está deligado");
        }
        else if(this.velAtual > 0 && x > 0){
            if(x <= this.velAtual){
            this.velAtual -= x;
            }
        }
        else System.out.println("O carro não pode ser desacelerado");
    }
}
