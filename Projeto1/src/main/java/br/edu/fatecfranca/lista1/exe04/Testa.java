package br.edu.fatecfranca.lista1.exe04;
public class Testa {
    public static void main(String[] args) {
        Rio obj1 = new Rio();
        obj1.nome = "Rio Negro";
        obj1.nivel = 553.98f;
        obj1.poluido = false;
        System.out.println(obj1.paraString());
        obj1.chover(200);
        obj1.ensolarar(100);
        obj1.sujar();
        System.out.println(obj1.paraString());
        
        Rio obj2 = new Rio("Amazonas", 345.76f, true);
        System.out.println(obj2.paraString());
        obj2.chover(200);
        obj2.ensolarar(100);
        obj2.limpar();
        System.out.println(obj2.paraString());
    }
}
