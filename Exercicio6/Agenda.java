package Exercicio6;
import java.lang.reflect.Array;
import java.util.*;

public class Agenda {
 
    private List<Contato> ArrayContato = new ArrayList<>();

    public void adicionarContato(String nome, int telefone){
        Contato novoContato = new Contato(nome, telefone);
        ArrayContato.add(novoContato);
    }

    public String buscarNome(String nome){
        for (Contato contato : ArrayContato) {
            if(contato.nomeContato.equalsIgnoreCase(nome)){
                return contato.nomeContato;
            }
        }
        System.out.println("Contato não encontrado!");
        return null;
    }

}
