public class Main {
    public static void main(String[] args) {
        productList("teste", 10.10);
        productList("teste2", 20.50);

        System.out.printf("\n \n");

        System.out.println("Listar os numeros pares de 0 a 20");
        evenNumber(20);
    }

    public static void productList(String productName, Double productValue) {
        System.out.println(productName + " - " + productValue);

    }

    public static void evenNumber(int numbers) {
        for (int i = 0; i <= numbers; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}