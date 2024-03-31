import java.util.Scanner;

public class VerificarFebre {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura do corpo (em graus Celsius): ");
        double temperatura = scanner.nextDouble();
        

        if (temperatura > 37.0) {
            System.out.println("O paciente está com febre.");
        } else {
            System.out.println("A temperatura do paciente está normal.");
        }
        
        scanner.close();
    }
}
