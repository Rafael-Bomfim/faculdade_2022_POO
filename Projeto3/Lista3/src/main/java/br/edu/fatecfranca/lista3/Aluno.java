package br.edu.fatecfranca.lista3;

public final class Aluno {
    private int ra;
    private String nome;
    private String endereco;
    
    public Aluno() {
        
    }
    
    public Aluno(int ra, String nome, String endereco) {
        this.setRa(ra);
        this.setNome(nome);
        this.setEndereco(endereco);
    }
  
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Aluno{" + "ra=" + ra + ", nome=" + nome + '}';
    }
}