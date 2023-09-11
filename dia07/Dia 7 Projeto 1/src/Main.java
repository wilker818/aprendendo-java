import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int firstNumber = newScanner.nextInt();

        System.out.print("Digite outro número: ");
        int secondNumber = newScanner.nextInt();

        System.out.print("Digite outro número novamente: ");
        int thirdNumber = newScanner.nextInt();

        System.out.format("%d\n%d\n%d",firstNumber,secondNumber,thirdNumber);
    }
}