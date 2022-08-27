package br.edu.fatecfranca.lista1.exe01;
public class Aluno {
    public int nroAluno; //tipo primitivo
    public String nome; //tipo de classe
    public double p1, p2; //tipo primitivo
    
    //construtor sem parâmetro
    public Aluno(){
        
    }
    //construtor com parâmetro
    public Aluno(int nroAluno, String nome, double p1, double p2){
        this.nroAluno = nroAluno;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }
    //calcula e retorna média final
    public double notaFinal(){
        return(this.p1 + this.p2) / 2;
    }
    //retorna os dados do aluno
    public String dadosAluno(){
        return "Nome: " + this.nome + "\n" + "Número do aluno: " + this.nroAluno 
                + "\n" + "Média: " +  this.notaFinal() + "\n";
    }
    //verifica se o aluno passou
    public void passou(){
        if(this.notaFinal() >= 6){
            System.out.println("Aluno aprovado");
        }
        else{
            System.out.println("Aluno reprovado");
        }
    }
}
