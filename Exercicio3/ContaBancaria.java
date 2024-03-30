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
        System.out.println("Deposito efetuado com sucesso!");
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
            System.out.println("Saque efetuado com sucesso!");
            return saque;
        }
    }
    public double getSaldo(){
        return this.saldoConta;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void printInfo(){
        System.out.println("Nome do Titular: "+ this.nomeTitular);
        System.out.println("Numero da da conta: "+ numeroConta);
        System.out.println("Saldo da conta: "+ saldoConta);
    }
}