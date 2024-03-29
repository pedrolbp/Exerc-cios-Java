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

    public static void addProduto(String nome, int quantidade, double preco){
        Produto novoProduto = new Produto(nome, quantidade, preco);

        ArrayProdutos.add(novoProduto);
    }


}
