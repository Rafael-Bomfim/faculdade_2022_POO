/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto1;

/**
 *
 * @author RafaelBomfim
 */
public class Produto { //criação de classe
    
    // vamos criar os atributos da classe
    // atributos são chamados de variáveis
    public int qtde; //variável primitiva
    public double preco; //variável primitiva
    public String nome; //variável por referência
    //criar um método construtor
    public Produto(String nome, int qtde, double preco) {
        this.nome = nome; //this, referenciar quem chamou o método
        this.qtde = qtde;
        this.preco = preco;
    }
    //criar método construtor vazio
    public Produto() {
        
    }
    
    //método que compra um produto, aumentando sua quantidade
    //método não retorna nada
    public void comprar(int x) {
        this.qtde = this.qtde + x;
    }
    
    public void vender(int x) {
        if(x <= this.qtde && this.qtde > 0) {
           this.qtde = this.qtde - x;
        }
        else System.out.println("Produto não disponível");
    }
    
    public void mostrar() {
        System.out.println("Nome: " + this.nome + "\n"
        + "Quantidade: " + this.qtde + "\n" +
                "Preço: " + this.preco + "\n");
    }
    
    public void descer(double x) {
        if (x <= this.preco) {
            this.preco -= x;
        }
        else System.out.println("Preço não pode ser negativo");
    }
    
    public void subir (double x){
        this.preco += x;
    }

}
