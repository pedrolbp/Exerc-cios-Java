package Exercicio7;

public class main7 {
    public static void main(String[] args){
        
        Produto.printTodosProdutos();
        
        Produto.addProduto("Arroz", 10, 15.00);
        Produto.addProduto("Feijao", 5, 20.00);
        Produto.addProduto("Farinha", 0, 5.50);

        System.out.println("------------------------------------------");

        System.out.println("Farinha antes do set: ");        
        System.out.println("Produto: "+ Produto.buscarProduto("Farinha").getNomeProduto());
        System.out.println("Quantidade: "+ Produto.buscarProduto("Farinha").getQuantidadeProduto());
        System.out.println("Preco: "+ Produto.buscarProduto("Farinha").getPrecoProduto());
        
        Produto.setQuantidadeProduto("Farinha", 20);
        Produto.setPrecoProduto("Farinha", 7.50);

        System.out.println("------------------------------------------");

        Produto.printProduto("Farinha");

        System.out.println("------------------------------------------");

        Produto.printTodosProdutos();


    }
}
