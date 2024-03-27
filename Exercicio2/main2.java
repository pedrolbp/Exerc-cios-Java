package Exercicio2;
import java.util.*;

public class main2 {
    public static void main(String args[]){
        List<Livro> LivrosArray = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
    
        while (true) {
            System.out.println("Digite 'sair' para sair");
            System.out.print("Digite o titulo do livro: ");
            String TituloMain = sc.nextLine();
            
            if(TituloMain.equalsIgnoreCase("sair")){
                break;
            }
                    
            System.out.print("Digite o autor do livro: ");
            String AutorMain = sc.nextLine();

            System.out.print("Digite o ano do livro: ");
            int AnoMain = sc.nextInt();
            sc.nextLine();
            
            Livro livroMain = new Livro(TituloMain, AutorMain, AnoMain);
            LivrosArray.add(livroMain);
            System.out.println("Livro registrado com sucesso!");
        }
        System.out.print("Gostaria de ver os livros?: ");
        String resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            for (Livro livro : LivrosArray) {
                livro.getInfo();
            }
        }
        else{                 
            System.exit(0);
        }  
        sc.close();                   
    }   



}
