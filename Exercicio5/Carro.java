package Exercicio5;

public class Carro {
    private String marcaCarro;
    private String modeloCarro;
    private int anoCarro;
    private double velocidadeAtual;  //velocidade em m/s
    private double aceleracao = 3; //velocidade em m/s^2
    
    public Carro(String marca, String modelo, int ano, double velocidadeAtualInicial){
        this.marcaCarro = marca;
        this.modeloCarro = modelo;
        this.anoCarro = ano;
        this.velocidadeAtual = velocidadeAtualInicial;
    }
    //tempo = Quantidade de tempo que o carro estará acelerando.
    public void acelerar(double tempo, double velocidadeAtualFunc){
        double novaVelocidade = velocidadeAtualFunc + this.aceleracao * tempo;
        this.velocidadeAtual = novaVelocidade > 0? novaVelocidade : 0;
    }
    
    public void frear(double tempo, double velocidadeAtualFunc){
        double novaVelocidade = velocidadeAtualFunc - this.aceleracao * tempo;
        this.velocidadeAtual = novaVelocidade > 0? novaVelocidade : 0;
    }

    public String getMarca(){
        return this.marcaCarro;
    }

    public String getModelo(){
        return this.modeloCarro;
    }

    public int getAno(){
        return this.anoCarro;
    }

    public double getVelocidadeAtual(){
        return this.velocidadeAtual;
    }

}