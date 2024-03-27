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
        return TituloLivro;
    }

    public String getAutor(){
        return AutorLivro;
    }

    public int getAno(){
        return AnoLivro;
    }

    public void getInfo(){
        System.out.println("-----------------------------------------------");
        System.out.println("Titulo: "+ TituloLivro);
        System.out.println("Autor: "+ AutorLivro);
        System.out.println("Ano: "+ AnoLivro);
    }
}
