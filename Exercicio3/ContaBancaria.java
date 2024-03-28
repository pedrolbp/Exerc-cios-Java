package Exercicio3;

public class ContaBancaria{
    private int numeroConta;
    private String nomeTitular;
    private double saldoConta = 0;

    public ContaBancaria(int numeroContaConstrutor, String nomeTitularConstrutor){
        this.numeroConta = numeroContaConstrutor;
        this.nomeTitular = nomeTitularConstrutor;
    }
    
    public void depositarSaldo(double valorDeposito){
        this.saldoConta = this.saldoConta + valorDeposito;
    }

    double saque;
    public double sacarSaldo(double valor){
        if(valor>saldoConta){
            System.out.println("Saldo insuficiente!");
            return -1;
        }
        else{
            saque = valor;
            this.saldoConta = this.saldoConta - saque;
            return saque;
        }
    }
    public double getSaldo(){
        return saldoConta;
    }
}