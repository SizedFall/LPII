import java.util.Scanner;

public class CalculoSalarioOperario {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();
        

        double valorPorHora = 20.00;
        double salario = horasTrabalhadas * valorPorHora;
        
    
        System.out.printf("O salário do operário é R$ %.2f%n", salario);
        
        scanner.close();
    }
}
