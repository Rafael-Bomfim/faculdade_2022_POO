package br.edu.fatecfranca.projeto1.exe0;

import br.edu.fatecfranca.projeto1.Produto;


public class Projeto1 { //criação de classe

    public static void main(String[] args) { //método para classe primitiva
        
        // vamos instanciar a classe Produto
        Produto obj1 = new Produto();
        obj1.nome = "Bola de basquete"; //dando valor aos atributos
        obj1.qtde = 3;
        obj1.preco = 120;
         
        obj1.comprar(10); //somando no objeto
        obj1.vender(3);
        obj1.descer(30.20);
        obj1.subir(4.5);
        
        obj1.mostrar();
        //classe, atributo e método, usado para saída de dados no terminal
        /*System.out.println("Nome: " + obj1.nome + "\n" +
                "Quantidade: " + obj1.qtde + "\n" +
                "Preço: R$" + obj1.preco + "\n"); */
        
        Produto obj2 = new Produto();
        obj2.nome = "Máscara"; //dando valor aos atributos
        obj2.qtde = 100;
        obj2.preco = 5;
        
        obj2.comprar(7);
        obj2.vender(5);
        obj2.descer(30.20);
        obj2.subir(4.5);
        
        obj2.mostrar();
        //classe, atributo e método, usado para saída de dados no terminal
        /*System.out.println("Nome: " + obj2.nome + "\n" +
                "Quantidade: " + obj2.qtde + "\n" +
                "Preço: R$" + obj2.preco + "\n"); */
        
        //instanciar explorando o método construtor
        //método que tem o mesmo nome da classe
        //método que inicializa as variáves da classe
        //chama o método construtor
        Produto obj3 = new Produto("Chapéu", 25, 30.5);
        
        obj3.comprar(200);
        obj3.vender(4);
        obj3.descer(30.20);
        obj3.subir(4.5);
        
        obj3.mostrar();
        //classe, atributo e método, usado para saída de dados no terminal
        /*System.out.println("Nome: " + obj3.nome + "\n" +
                "Quantidade: " + obj3.qtde + "\n" +
                "Preço: R$" + obj3.preco); */
    }
}
