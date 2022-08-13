/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.fatecfranca.projeto1;

/**
 *
 * @author RafaelBomfim
 */
public class Projeto1 { //criação de classe

    public static void main(String[] args) { //método para classe primitiva
        
        // vamos instanciar a classe Produto
        Produto obj1 = new Produto();
        obj1.nome = "Bola de basquete"; //dando valor aos atributos
        obj1.qtde = 3;
        obj1.preco = 120;
        //classe, atributo e método, usado para saída de dados no terminal
        System.out.println("Nome: " + obj1.nome + "\n" +
                "Quantidade: " + obj1.qtde + "\n" +
                "Preço: R$" + obj1.preco);              
    }
}
