package Exercicio1;
public class calculadora {
    public static double soma(double a, double b){
        return a + b;
    }

    public static double sub(double a, double b){
        return a - b;
    }

    public static double mult(double a, double b){
        return a * b;
    }


    public static double div(double a, double b){
        
        if (a == 0 || b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }
}