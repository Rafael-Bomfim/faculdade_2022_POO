package br.edu.fatecfranca.lista4;

public class Funcionario {
    
    protected String nome, cpf;
    protected int codigo;
    protected float salario, cargaHoraria;

    public Funcionario(){
        
    }

    public Funcionario(String nome, String cpf, int codigo, float salario, 
            float cargaHoraria) {
        this.nome = nome;
        this.cpf = cpf;
        this.codigo = codigo;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + "\n" + " cpf=" + cpf + "\n" +
                " codigo=" + codigo + "\n" + " salario=" + salario + 
                " cargaHoraria=" + cargaHoraria + "\n" + '}';
    }
    
    public float calculaSalario(){
        return this.salario;
    }
}

