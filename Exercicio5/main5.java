package Exercicio5;

public class main5 {
    public static void main(String[] args){
        Carro carro1 = new Carro("Volkswagen", "Fusca", 1990, 0);

        carro1.acelerar(10);
        System.out.println("Velocidade após acelerar: "+ carro1.getVelocidadeAtual());

        System.out.println("------------------------------------------");

        carro1.frear(5);
        System.out.println("Velocidade atual após frear: "+ carro1.getVelocidadeAtual());

        System.out.println("------------------------------------------");

        carro1.acelerar(3);
        carro1.printInfoCarro();

    }
}
