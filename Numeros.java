import java.util.Scanner;

public class Numeros {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo numero:");
        double num2 = scanner.nextDouble();

        if (num1 > num2){
            System.out.println("O maior numero é: " + num1);
        }
        else if (num2 > num1) {
            System.out.println("O maior numero é: " + num2);
        }
        else {
            System.out.println("Os números são iguais");
        }
        scanner.close();
    }
}
