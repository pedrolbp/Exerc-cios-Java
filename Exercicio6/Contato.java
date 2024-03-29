package Exercicio6;

public class Contato {
    protected String nomeContato;
    protected int telefoneContato;

    public Contato(String nome, int telefone){
        this.nomeContato = nome;
        this.telefoneContato = telefone;
    }

    public String getNomeContato() {
        return this.nomeContato;
    }

    public int getTelefoneContato() {
        return this.telefoneContato;
    }

    

}