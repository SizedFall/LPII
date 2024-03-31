import java.util.Scanner;

public class SomaValores {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        
     
        double soma = valor1 + valor2;
        
        
        if (soma > 10) {
            System.out.println("A soma dos valores é: " + soma);
        }
        
        scanner.close();
    }
}
