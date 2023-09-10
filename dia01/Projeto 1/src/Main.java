import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner calculadoraScanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        double firstNumber = calculadoraScanner.nextDouble();

        System.out.println("Digite o segundo numero");
        double secondNumber = calculadoraScanner.nextDouble();


        double resultSome = (firstNumber + secondNumber);

        System.out.println("A soma é: " + resultSome);
    }
}