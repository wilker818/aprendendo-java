import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaTexto = new Scanner(System.in);

        // Coletar o nome do produto
        System.out.print("Digite qualquer nome: ");
        String texto = entradaTexto.nextLine().toUpperCase();

        // Cria uma StringBuilder para construir a nova string com espaços
        StringBuilder output = new StringBuilder();

        // Itera através dos caracteres da entrada
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            // Adiciona o caractere à saída
            output.append(c);

            // Adiciona um espaço depois do caractere, exceto no último caractere
            if (i < texto.length() - 1) {
                output.append(" ");
            }
        }

        System.out.println();

        // Exibe a saída com espaços
        System.out.println("Texto com espaços entre os caracteres:");
        System.out.println(output.toString());

        System.out.printf("\n\n--metodo corrigido--\n\n");

        String spaces = "Hello World";

        for (int j = 0; j <= spaces.length() - 1; j++) {
            System.out.print(spaces.charAt(j) + " ");
        }

        System.out.printf("\n\n--metodo corrigido2--\n\n");

        System.out.print("Digite qualquer nome: ");
        String spaces2 = entradaTexto.nextLine().toUpperCase();

        for (int t = 0; t <= spaces2.length() - 1; t++) {
            System.out.print(spaces2.charAt(t) + " ");
        }

    }
}