import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite um num1 op num (2 * 4): ");

        Scanner newScanner = new Scanner(System.in);
        double num1 = newScanner.nextDouble();
        char op = (newScanner.next().charAt(0));
        double num2 = newScanner.nextDouble();

        switch (op) {
            case '+':
                System.out.println((int) num1 + num2);
                break;
            case '-':
                System.out.println((int) num1 - num2);
                break;

            case '*':
                System.out.println((int) num1 * num2);
                break;

            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Formato invalido!");
                break;
        }
    }
}