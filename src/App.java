import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite a quantidade de lados: ");
        int lados = scanner.nextInt();
        System.out.println("Digite a quantidade de vezes: ");
        int vezes = scanner.nextInt();

        int soma = 0;
        for(int i = 0; i < vezes; i++) {
            int numero = random.nextInt(lados) + 1;

            soma += numero;
            System.out.println(numero);
        }

        System.out.println("A soma é: " + soma);
    }
}
