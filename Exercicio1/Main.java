package Exercicio1;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma das opções: Soma(+), Subtração(-), Multiplicação(*), Divisão(/)");
        System.out.println("Calculadora: ");

        String input = sc.nextLine();

        // Usando expressões regulares para extrair números e operador
        String[] elementos = input.split("(?<=[-+*/])|(?=[-+*/])");

        double a = Double.parseDouble(elementos[0]);
        char operador = elementos[1].charAt(0);
        double b = Double.parseDouble(elementos[2]);

        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = a + b;
                break;

            case '-':
                resultado = a - b;
                break;

            case '/':
                resultado = a / b;
                break;

            case '*':
                resultado = a * b;
                break;

            default:
                break;
        }

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}
