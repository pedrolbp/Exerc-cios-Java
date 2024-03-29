package Exercicio6;
import java.lang.reflect.Array;
import java.util.*;

public class Agenda {
 
    private static List<Contato> ArrayContato = new ArrayList<>();

    public static void adicionarContato(String nome, int telefone){
        Contato novoContato = new Contato(nome, telefone);
        ArrayContato.add(novoContato);
    }

    public static Contato buscarContato(String nome){
        for (Contato contato : ArrayContato) {
            if(contato.nomeContato.equalsIgnoreCase(nome)){
                return contato;
            }
        }
        return null;
    }

    public void setNomeContato(String nome, String novoNomeContato) {
        Agenda.buscarContato(nome).nomeContato = novoNomeContato;
    }

    public void setTelefoneContato(String nome, int novoTelefoneContato) {
        Agenda.buscarContato(nome).telefoneContato = novoTelefoneContato;
    }


    public static void printTodosContatos(){
        for (Contato contato : ArrayContato) {
            System.out.println("-----CONTATOS-----");  
            System.out.println("Nome: "+ contato.nomeContato);
            System.out.println("Telefone: "+ contato.telefoneContato);
            System.out.println("--------------------------------------");
        }
    }

    public static void printContato(String nome){
        if (buscarContato(nome) != null) {
            System.out.println("Nome: "+ buscarContato(nome).nomeContato);
            System.out.println("Telefone: "+ buscarContato(nome).telefoneContato);
        } else {
            System.out.println("Contato não encontrado!");
        }
        
        
    }


}
