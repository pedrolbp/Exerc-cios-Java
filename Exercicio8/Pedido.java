package Exercicio8;

import java.util.*;

public class Pedido {
    protected List<Pizza> ArrayPizzas;
    protected String enderecoEntrega;
    protected int codigoPedido;
    protected static List<Pedido> ArrayPedidos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public Pedido(int codigo, String endereco) {
        this.ArrayPizzas = new ArrayList<>();
        this.codigoPedido = codigo;
        this.enderecoEntrega = endereco;
    }

    public static void addPedido(Integer codigo, String endereco){
        Pedido novoPedido = new Pedido(codigo, endereco);
        ArrayPedidos.add(novoPedido);
    }


    //Adiciona uma pizza no ArrayPizzas de um pedido ja criado, especificado pelo codigo do pedido.
    public static void addPizza(int codigo){
        int repostaNumero;
        String nome;
        Double valor;
        String ingredientesRemovidosInput;

        System.out.print("Quantas pizzas serao adicionadas no pedido ("+ codigo+")?: ");
        repostaNumero = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < repostaNumero; i++) {
            List<String> ingredientesRemovidos = new ArrayList<>();

            System.out.print("Sabor da pizza: ");
            nome = sc.nextLine();

            System.out.print("Valor da pizza: ");
            valor = sc.nextDouble();
            sc.nextLine();

            System.out.print("Ingredientes removidos: ");
            ingredientesRemovidosInput = sc.nextLine();
            String[] partes = ingredientesRemovidosInput.split(",\\s*eE");

            for (String parte : partes) {
                ingredientesRemovidos.add(parte);
            }

            Pizza novaPizza = new Pizza(nome, valor, ingredientesRemovidos);
            buscarPorCodigo(codigo).ArrayPizzas.add(novaPizza);
        }
    }


    public static Pedido buscarPorCodigo(int codigoUsuario){
        for (Pedido pedido : ArrayPedidos) {
            if (pedido.codigoPedido == codigoUsuario ) {
                return pedido;
            }
        }
        return null;
    }

    //Printa o pedido especificado pelo codigo
    public static void printPedido(int codigo){
        if (buscarPorCodigo(codigo) == null) {
            System.out.println("Pedido não encontrado!");
        } 
        else {
            System.out.println("-----PEDIDO-----");
            System.out.println("Codigo do pedido: "+ codigo);
            System.out.println("Endereco: "+ getEnderecoEntrega(codigo));
            System.out.println("-----PIZZAS-----");
            for (Pizza pizza : buscarPorCodigo(codigo).ArrayPizzas){
                System.out.println("Sabor: "+ pizza.getNomePizza());
                System.out.println("Valor: "+ pizza.getValorPizza());
                for (String str : pizza.getIngredientes()) {
                    System.out.println("Ingredientes removidos: "+str);
                }
            System.out.println("----------------");
            }
        }
    }

    public static void printTodosPedidos(){
        System.out.println("-----PEDIDOS-----");
        for (Pedido pedido : ArrayPedidos) {
            System.out.println("Endereco: "+ pedido.enderecoEntrega);
            System.out.println("Codigo do pedido: "+ pedido.codigoPedido);
            System.out.println("-----PIZZAS-----");
            for (Pizza pizza : pedido.ArrayPizzas) {
                System.out.println("Sabor: "+ pizza.getNomePizza());
                System.out.println("Valor: "+ pizza.getValorPizza());
            for (String str : pizza.getIngredientes()) {
                System.out.println("Ingredientes removidos: "+str);
            }
            System.out.println("-----PIZZAS-----");
            System.out.println();
           } 
        }
        System.out.println("-----PEDIDOS-----");
    }

    public static void cancelarPedido(int codigo) {
        ArrayPedidos.remove(buscarPorCodigo(codigo));
    }

    public static void setEnderecoEntrega(int codigo, String enderecoNovo) {
        buscarPorCodigo(codigo).enderecoEntrega = enderecoNovo;
    }

    public static String getEnderecoEntrega(int codigo) {
        return buscarPorCodigo(codigo).enderecoEntrega;
    }

    public static double totalPedidos() {
        return ArrayPedidos.size();
    }

    public static double mediaValoresPedidos(){
        double media = 0;
        for (Pedido pedido : ArrayPedidos) {
            for (Pizza pizza : pedido.ArrayPizzas) {
                media += pizza.getValorPizza();
            }
        }
        return media / ArrayPedidos.size();
    }
}

