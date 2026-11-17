import java.util.Scanner;

public class Exercicio06 {

    public static int contarVogais(String texto) {
        int total = 0;
        String minusculo = texto.toLowerCase();
        for (int i = 0; i < minusculo.length(); i++) {
            char c = minusculo.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                total = total + 1;
            }
        }
        return total;
    }

    public static void exibirContagem(String[] frases) {
        int maiorQuantidade = -1;
        String fraseComMaisVogais = "";

        for (int i = 0; i < frases.length; i++) {
            int vogais = contarVogais(frases[i]);
            System.out.println(frases[i] + " -> " + vogais + " vogais");
            if (vogais > maiorQuantidade) {
                maiorQuantidade = vogais;
                fraseComMaisVogais = frases[i];
            }
        }

        System.out.println("Frase com mais vogais: " + fraseComMaisVogais);
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] frases = new String[3];

        for (int i = 0; i < frases.length; i++) {
            System.out.print("Frase " + (i + 1) + ": ");
            frases[i] = leitor.nextLine();
        }

        exibirContagem(frases);
    }
}
