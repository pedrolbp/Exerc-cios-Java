package Exercicio3;

import java.util.*;

public class main3 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta;
        ContaBancaria novaConta = null;


        System.out.println("Digite 'sair' para sair.");
        System.out.print("Voce gostaria de criar uma conta?: ");
        resposta = sc.nextLine();

        if(resposta.equalsIgnoreCase("sim"))
        {
            
            String nome;
            int numero;

            System.out.print("Insira o nome do titular :");
            nome = sc.nextLine();

            System.out.print("Insira o numero da conta: ");
            numero = sc.nextInt();
            sc.nextLine();

            novaConta = new ContaBancaria(numero, nome);
            
        } else 
        {
            System.exit(0);
        }

        System.out.print("Voce gostaria de depositar na conta?: ");
        resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("sim")) 
        {
            double valor;
 
            System.out.print("Qual o valor?: ");
            valor = sc.nextDouble();
            sc.nextLine();

            novaConta.depositarSaldo(valor);
        } else {
            System.exit(0);
        }
        
        System.out.print("Gostaria de sacar dinheiro?: ");
        resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            double valor;
 
            System.out.print("Qual o valor?: ");
            valor = sc.nextDouble();
            sc.nextLine();

            novaConta.sacarSaldo(valor);
        } else if (resposta.equalsIgnoreCase("nao")) {
                System.out.print("Deseja mostrar as informacoes da conta?: ");
                resposta = sc.nextLine();

                if (resposta.equalsIgnoreCase("sim")) {
                    novaConta.printInfo();
                } else{
                    System.exit(0);
                }
            }
        else {
            System.exit(0);
        }

        System.out.print("Deseja mostrar as informacoes da conta?: ");
        resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            novaConta.printInfo();
        } else{
            System.exit(0);
        }
        sc.close();
    }
}
