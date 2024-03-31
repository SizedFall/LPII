import java.util.Scanner;

public class CalcularAreaCircunferencia {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio da circunferência: ");
        double raio = scanner.nextDouble();
        
     
        double pi = Math.PI;
        double area = pi * raio * raio;
        
    
        System.out.println("A área da circunferência é: " + area);
        
        scanner.close();
    }
}
