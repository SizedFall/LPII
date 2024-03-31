import java.util.Scanner;

public class CalcularSalarioProfessor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da hora aula: ");
        double valorHoraAula = scanner.nextDouble();
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();
        System.out.print("Digite o percentual de desconto do INSS (em %): ");
        double percentualINSS = scanner.nextDouble();
        
        
        double salarioBruto = valorHoraAula * horasTrabalhadas;
        
    
        double descontoINSS = (percentualINSS / 100.0) * salarioBruto;
        
    
        double salarioLiquido = salarioBruto - descontoINSS;
        
    
        System.out.println("O salário líquido do professor é: R$ " + salarioLiquido);
        
        scanner.close();
    }
}
