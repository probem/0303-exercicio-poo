import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de lados: ");
        int lados = scanner.nextInt();
        System.out.println("Digite a quantidade de vezes: ");
        int vezes = scanner.nextInt();

        Dado dado = new Dado(lados);
        Sorteador sorteador = new Sorteador(dado);
        Resultado resultado = sorteador.sortear(vezes);

        System.out.println(resultado.getNumeros());
        System.out.println(resultado.getSoma());
    }
}
