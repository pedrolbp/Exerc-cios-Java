package Exercicio7;

import java.util.*;

public class Produto {
    private String nomeProduto;
    private int quantidadeProduto;
    private double precoProduto;

    private static List<Produto>ArrayProdutos = new ArrayList<>();

    public Produto(String nome, int quantidade, double preco){
        this.nomeProduto = nome;
        this.quantidadeProduto = quantidade;
        this.precoProduto = preco;
    }

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public double getPrecoProduto() {
        return this.precoProduto;
    }

    public int getQuantidadeProduto() {
        return this.quantidadeProduto;
    }

    public static void setPrecoProduto(String nome, double novoPreco){
        buscarProduto(nome).precoProduto = novoPreco;
    }

    public static void setQuantidadeProduto(String nome, int novaQuantidade){
        buscarProduto(nome).quantidadeProduto = novaQuantidade;
    }

    public static void addProduto(String nome, int quantidade, double preco){
        Produto novoProduto = new Produto(nome, quantidade, preco);

        ArrayProdutos.add(novoProduto);
    }

    public static Produto buscarProduto(String nome){
        for (Produto produto : ArrayProdutos) {
            if(produto.nomeProduto.equalsIgnoreCase(nome)){
                return produto;
            }
        }
        return null;
    }

    public static void printProduto(String nome){
        if (buscarProduto(nome) != null) {
            System.out.println("Produto: "+ buscarProduto(nome).nomeProduto);
            System.out.println("Quantidade: "+ buscarProduto(nome).quantidadeProduto);
            System.out.println("Preco: "+ buscarProduto(nome).precoProduto);
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    public static void printTodosProdutos(){
        System.out.println("-----PRODUTOS-----");
        if(ArrayProdutos.isEmpty()){
            System.out.println("Não existem produtos!");
        } else {
            for (Produto produto : ArrayProdutos) {
            System.out.println("Produto: "+ produto.nomeProduto);
            System.out.println("Quantidade: "+ produto.quantidadeProduto);
            System.out.println("Preco: "+ produto.precoProduto);
            System.out.println("------------------------------------------");
        }
        }
    }

}
