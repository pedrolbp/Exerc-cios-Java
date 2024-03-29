package Exercicio2;

public class Livro {
   
     private String TituloLivro;
     private String AutorLivro;
     private int AnoLivro;
     
    public Livro(String titulo, String autor, int ano){
     
        this.TituloLivro = titulo;
        this.AutorLivro = autor;
        this.AnoLivro = ano;
        
    }

    public String getTitulo(){
        return this.TituloLivro;
    }

    public String getAutor(){
        return this.AutorLivro;
    }

    public int getAno(){
        return this.AnoLivro;
    }

    public void getInfo(){
        System.out.println("-----------------------------------------------");
        System.out.println("Titulo: "+ TituloLivro);
        System.out.println("Autor: "+ AutorLivro);
        System.out.println("Ano: "+ AnoLivro);
    }
}
