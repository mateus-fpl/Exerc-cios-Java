import java.util.Scanner;

public class ImparFor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();
        while (n <= 0){
            System.out.print("O número deve ser positivo");
            n = scanner.nextInt();
        }
        System.out.println("\nVeja os " + n + " os primeiros impares:");
        for (int cont=1, impar= 1; cont <= n; impar=impar + 2,  cont =cont + 1){
            System.out.print(impar + " ");
        
        }
        
        scanner.close();
    }
    
}
