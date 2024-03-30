package Exercicio8;

import java.util.*;

public class Pizza {
    protected String nomePizza;
    protected double valorPizza;
    protected List<String> ingredientesExcluidosPizza;

    public Pizza(String nome, double valor, List<String> ingredientes) {
        this.nomePizza = nome;
        this.valorPizza = valor;
        this.ingredientesExcluidosPizza = ingredientes;
    }

    public Pizza(){

    };

    public String getNomePizza() {
        return nomePizza;
    }

    public double getValorPizza() {
        return valorPizza;
    }

    public List<String> getIngredientes() {
        return ingredientesExcluidosPizza;
    }


}