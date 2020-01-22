import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de lados: ");
        int lados = scanner.nextInt();
        System.out.println("Digite a quantidade de vezes: ");
        int vezes = scanner.nextInt();

        Dado dado = new Dado(lados);

        int soma = 0;
        for(int i = 0; i < vezes; i++) {
            int numero = dado.jogar();

            soma += numero;
            System.out.println(numero);
        }

        System.out.println("A soma é: " + soma);
    }
}
