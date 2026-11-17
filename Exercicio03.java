import java.util.Scanner;

public class Exercicio03 {

    public static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int contarPrimos(int[] v) {
        int total = 0;
        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                total = total + 1;
            }
        }
        return total;
    }

    public static void exibirPrimos(int[] v) {
        System.out.println("Números primos:");
        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                System.out.println(v[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = leitor.nextInt();
        }

        exibirPrimos(numeros);
        System.out.println("Quantidade de primos: " + contarPrimos(numeros));
    }
}
