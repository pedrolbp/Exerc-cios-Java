package Exercicio4;

public class main4 {
    public static void main(String[] args){

        Jogador jogador1 = new Jogador("Pedro", 0, 0);
        
        jogador1.aumentarPontuacao(100);
        System.out.println("Pontuacao atual: "+ jogador1.getPontuacao());
        
        System.out.println("------------------------------------------");

        jogador1.setPontuacao(35);
        System.out.println("Pontuacao atual: "+ jogador1.getPontuacao());

        System.out.println("------------------------------------------");

        jogador1.setNivel(100);
        System.out.println("Nivel atual: "+ jogador1.getNivel());

        System.out.println("------------------------------------------");

        for(int i = 0; i < 7; i++){
            jogador1.levelUp();
        }

        jogador1.printInfoJogador();
    }
}
