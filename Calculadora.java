//ler 2 números e uma opção
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        char operacao;

        System.out.print("digite o primeiro numero: ");
        num1 = scanner.nextDouble();
        System.out.print("digite o segundo numero: ");
        num2 = scanner.nextDouble();
        System.out.print("escolha +, -, *, /: ");
        scanner.nextLine();//sumidouro: vai limpar o buffer de entrada
        operacao = scanner.nextLine().charAt(0);

        if (operacao == '+') {
            resultado = num1 + num2;
            System.out.println("soma = " + resultado);
        }
        else if (operacao == '-'){
            resultado = num1 - num2;
            System.out.println("subtracao = " + resultado);
        }
        else if (operacao == '*'){
            resultado = num1 * num2;
            System.out.println("multiplicacao = " + resultado);
        }
        else if (operacao == '/'){
            if (num2 == 0){
                System.out.print("nao existe divisao por 0");
            }
            else {

             resultado = num1 / num2;
            System.out.println("divisao = " + resultado);
            }
        } 
        else {
            System.out.println("operacao invalida");
        }
        scanner.close();
    }
}