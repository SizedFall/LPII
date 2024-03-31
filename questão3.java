import java.util.Scanner;

public class VerificarCarteiraMotorista {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        if (idade >= 18) {
            System.out.println("Você pode tirar a carteira de motorista.");
        } else {
            System.out.println("Você não pode tirar a carteira de motorista ainda.");
        }
        
        scanner.close();
    }
}
