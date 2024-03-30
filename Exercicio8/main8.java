package Exercicio8;

public class main8 {
    public static void main(String[] args){
        //Adicionando pedido e adicionando pizza ao pedido 15
        Pedido.addPedido(15, "Republica argentina 123");
        Pedido.addPizza(15);
        
        //Printando a pizza
        System.out.println("-------------------Printando pedido------------------- ");
        Pedido.printPedido(15);
        
        //Adicionando pedido
        Pedido.addPedido(20, "Avenida Iguaçu");
        Pedido.addPizza(20);
        
        //Adicionando Pedido
        Pedido.addPedido(30, "Avenida Silva Jardim");
        Pedido.addPizza(30);

        //Printando todos os pedidos que existem
        System.out.println("-------------------Printando pedido------------------- ");
        Pedido.printTodosPedidos();
        System.out.println("Media de todos os pedidos: "+ Pedido.mediaValoresPedidos());

        //Cancelando pedido 15 e 20
        Pedido.cancelarPedido(15);
        Pedido.cancelarPedido(20);

        System.out.println("-------------------Printando pedido------------------- ");
        Pedido.printTodosPedidos();

        //Mudando o endereço do pedido 30
        Pedido.setEnderecoEntrega(30, "Rua Rezala Simão");

        System.out.println("-------------------Printando pedido------------------- ");
        Pedido.printPedido(30);
        System.out.println("-------------------Printando pedido------------------- ");

    }
}
