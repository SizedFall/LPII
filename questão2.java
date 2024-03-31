import java.util.Scanner;

public class CalculoViagem {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a distância a ser percorrida (em quilômetros): ");
        double distancia = scanner.nextDouble();
        System.out.print("Digite o preço do litro da gasolina: ");
        double precoLitro = scanner.nextDouble();
        
        
        double consumoMedio = 12.0;
        double gasolinaNecessaria = distancia / consumoMedio;
        
        double custoViagem = gasolinaNecessaria * precoLitro;
        
        System.out.printf("Será necessário colocar %.2f litros de gasolina.%n", gasolinaNecessaria);
        System.out.printf("O custo da viagem será de R$ %.2f%n", custoViagem);
        
        scanner.close();
    }
}
