package Exercicio6;

public class main6 {
    public static void main(String[] args){
        
        Agenda.printTodosContatos();
        
        Agenda.adicionarContato("Pedro", 12345678);
        Agenda.adicionarContato("Lucas", 23456789);
        
        System.out.println("------------------------------------------");
        
        Agenda.printContato("Lucas");
        
        System.out.println("------------------------------------------");

        Agenda.setNomeContato("Lucas", "Joao");
        Agenda.setTelefoneContato("Joao", 11112222);

        System.out.println("Novo nome: "+ Agenda.buscarContato("Joao").nomeContato);
        System.out.println("Novo telefone: "+ Agenda.buscarContato("Joao").telefoneContato);

        System.out.println("------------------------------------------");
        
        Agenda.printContato("Carlos");

        System.out.println("------------------------------------------");

        Agenda.printTodosContatos();

    }
}
