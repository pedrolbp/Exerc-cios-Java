package Exercicio6;

public class main6 {
    public static void main(String[] args){
        Agenda.adicionarContato("Pedro", 12345678);
        Agenda.adicionarContato("Lucas", 23456789);
        
        System.out.println("------------------------------------------");
        
        Agenda.printContato("Lucas");
        
        System.out.println("------------------------------------------");
        
        Agenda.printContato("Carlos");

        System.out.println("------------------------------------------");

        Agenda.printTodosContatos();

    }
}
