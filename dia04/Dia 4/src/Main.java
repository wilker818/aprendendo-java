import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradadTexto = new Scanner (System.in);
        //Coletar o nome do produto
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = entradadTexto.next().toLowerCase();

        //Retornar o valor do produto

        switch(nomeProduto){
            case "banana":
                System.out.println("R$9,50");
                break;
            case "manga":
                System.out.println("R$12,80");
                break;
            case "abacate":
                System.out.println("R$16,10");
                break;

        }

        System.out.println("--------------------------");

        /* Criando um FOR loop */
        // int i = 0; = cria um armazenamento
        // i < 10; = verifica se o i é menor que 10
        // i++ seria um contador para acressentar +1 no i
        for (int i = 0; i < 10; i++){
            System.out.println("teste");
        }

        System.out.println("--------------------------");

        /* Criando um FOR loop com Arrays */
        String[] cars = {"BMW", "Tesla", "Fiat", "Ferrari"};

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i] + " ");
        }

        System.out.println("-----------Pulando-------------");

        //uso de um FOR Each
        for(String car : cars){
            System.out.println(car + " ");
        }

        System.out.println("--------------------------");

        /* Nested Loops, encadeamento de for loops */
        for (int i = 0; i < 2; i++){
            for( int j = 0; j < 2; j++){
                System.out.println(i + " " + j);
            }
        }

        System.out.println("--------------------------");

        /* While loops */
        int i = 0;
        while(i < 5){
            System.out.println(i + " " +"HI WHILE LOOP");
            i++;
        }



    }
}