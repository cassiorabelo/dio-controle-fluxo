import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = (new Scanner(System.in)).useLocale(Locale.US);

        try {
            System.out.print("Digite o primeiro parâmetro: ");
            int parametro1 = scanner.nextInt();
            System.out.print("Digite o segundo parâmetro: ");
            int parametro2 = scanner.nextInt();
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Exceção: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Exceção: valor inserido inválido.");
        }

        scanner.close();
    }

    public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 >= parametro2) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametro2 - parametro1;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
