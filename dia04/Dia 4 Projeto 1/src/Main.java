public class Main {
    public static void main(String[] args) {
        //numeros pares
        for (int i = 0; i <= 100; i++){
            System.out.print(i++ + " ");
        }

        System.out.format("\n");

        //numeros inparespares
        for (int i = 0; i < 100; i++){
            System.out.print((i++ + 1) + " ");
        }


        System.out.format("\n\n--------metodo corrigido---------\n\n");

        //numeros pares corrigido
        for (int i = 0; i <= 100; i++){
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.format("\n");

        //numeros inparespares corrigido
        for (int i = 0; i <= 100; i++){
            if(i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}