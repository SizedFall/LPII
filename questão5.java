import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo número (diferente do primeiro): ");
        double numero2 = scanner.nextDouble();
        
    
        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else {
            System.out.println("O maior número é: " + numero2);
        }
        
        scanner.close();
    }
}
