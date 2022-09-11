package br.edu.fatecfranca.lista3;

import java.util.Date;

public class Lista3 {

    public static void main(String[] args) {
     
        Aluno objAluno = new Aluno(123, "Zé", "São Paulo");
        Disciplina objDisciplina = new Disciplina(1, "POO");
        Matricula obj = new Matricula(100, new Date(), objAluno, objDisciplina);
        System.out.println(obj.toString());
    }
}