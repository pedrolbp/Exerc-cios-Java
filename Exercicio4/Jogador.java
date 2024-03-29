package Exercicio4;

public class Jogador{
    private String nomeJogador;
    private int pontuacaoJogador = 0;
    private int nivelJogador = 0;

    public Jogador(String nome, int pontuacao, int nivel){
        this.nomeJogador = nome;
        this.pontuacaoJogador = pontuacao;
        this.nivelJogador = nivel;

    }

    public void setPontuacao(int pontuacaoNova){
        this.pontuacaoJogador = pontuacaoNova;
    }

    public void aumentarPontuacao(int valor){
        this.pontuacaoJogador += valor;
    }


    public void setNivel(int nivelNovo){
        this.nivelJogador = nivelNovo;
    }

    public void levelUp(){
        this.nivelJogador++;
    }

    public String getNome(){
        return this.nomeJogador;
    }

    public int getPontuacao(){
        return this.pontuacaoJogador;
    }

    public int getNivel (){
        return this.nivelJogador;
    }

    public void printInfoJogador(){
        System.out.println("Nome do jogador: "+ getNome());
        System.out.println("Pontuacao do jogador: "+ getPontuacao());
        System.out.println("Nivel do jogador: "+ getNivel());
    }

    }