package br.edu.fatecfranca.lista1.exe04;
public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido; //true - poluido, false - não poluido
    
    public Rio(){
        
    }
    
    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    
    public void ensolarar(double x){
        if(x <= this.nivel){
            this.nivel -= x;
            System.out.println("Nível do rio foi diminuido");
        }
        else{
            System.out.println("Nível do rio não pode ser negativo");
        }
    }
    
    public void chover(double x){
        this.nivel += x;
        System.out.println("Nível do rio foi aumentado");
    }
    
    public void sujar(){
        if(this.poluido){
            System.out.println("O rio já está poluído");
        }
        else{
            System.out.println("O rio foi poluído");
        }
    }
    
    public void limpar(){
        if(!this.poluido){
            System.out.println("O rio já está limpo");
        }
        else{
            System.out.println("O rio foi limpo");
        }
    }
    
    public String paraString(){
        String aux = (this.poluido ? "Está poluído" : "Está limpo");
        return "Nome: " + this.nome
        + "\n" +
        "Nível: " + this.nivel
        + "\n" +
        "Situação: " + aux
        + "\n";
    }
}
