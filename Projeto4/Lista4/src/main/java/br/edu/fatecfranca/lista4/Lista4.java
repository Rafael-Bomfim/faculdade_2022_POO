package br.edu.fatecfranca.lista4;

import java.util.ArrayList;

public class Lista4 {    
    public static void converteString(Funcionario objFuncionario){
        System.out.println(objFuncionario.toString());
    }
    
    public static void calcSalario(Funcionario objFuncionario) {
        System.out.println("Salário Final" + objFuncionario.calculaSalario());
    }
    
    public static void main(String[] args) {
       
        Gerente objGerente = new Gerente(2000, "Fulano", "123", 
            1, 4000, 40);
        converteString(objGerente);
        calcSalario(objGerente);
        
        Assistente objAssistente = new Assistente(10, "Fulano", "Beltrano", 
            "345", 2, 2000, 40);
        converteString(objAssistente);
        calcSalario(objAssistente);
        
        Diretor objDiretor = new Diretor(10, "Ciclano", "789", 3, 5000, 40);
        converteString(objDiretor);
        calcSalario(objDiretor);
        
        //criando vetor de funcionário
        ArrayList<Funcionario> vetor = new ArrayList();
        vetor.add(objGerente);
        vetor.add(objDiretor);
        vetor.add(objAssistente);
        
        for(int i=0; i<3;i++)
            converteString(vetor.get(i));
    }
}
