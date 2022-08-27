package br.edu.fatecfranca.lista1.exe02;
public class Testa {
    public static void main(String[] args) {
       Cliente obj1 = new Cliente();
       obj1.nroConta = 444;
       obj1.nroAgencia = 0001;
       obj1.nome = "José";
       obj1.saldo = 5000;
       System.out.println(obj1.paraString());
       obj1.depositar(700);
       obj1.sacar(500);
       System.out.println(obj1.paraString());
       
       Cliente obj2 = new Cliente(333, 0002, "Maria", 3000);
       System.out.println(obj2.paraString());
       obj2.depositar(700);
       obj2.sacar(500);
       System.out.println(obj2.paraString());
    }
    
}
