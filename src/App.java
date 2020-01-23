import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de lados: ");
        int lados = scanner.nextInt();
        System.out.println("Digite a quantidade de vezes: ");
        int vezes = scanner.nextInt();

        try {
            Dado dado = new Dado(lados);
            Sorteador sorteador = new Sorteador(dado);
            Resultado resultado = sorteador.sortear(vezes);

            System.out.println(resultado.getNumeros());
            System.out.println(resultado.getSoma());
        } catch (DadoInvalidoException e){
            System.out.println("O número de lados digitado é inválido");
            System.out.println("O número de lados deve ser 4, 6, 8, 10, 12 ou 20");
        }
    }
}
