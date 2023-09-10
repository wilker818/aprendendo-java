import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* Array de numeros */
        int[] valores = { 10, 20, 15, 30, 40};
        Arrays.sort(valores);//ordena os valores dentro da array

        System.out.println(valores.length);//quantidade de itens dentro da array
        System.out.println(Arrays.toString(valores));//metodo para imprimir arrays

        /* Array de Strings */
        String[] cars = {"BMW", "Tesla", "Jeep", "Fiat"};
        cars[2]= "Ferrari";

        System.out.println(Arrays.toString(cars));
        System.out.println(cars[2]);

        /* Array  MultiDimencional */
        String[][] carsMultiDimencional = {{"BMW", "Tesla"}, {"Jeep", "Fiat"}};

        //deepToString seria um funcao que trabalha mais afundo do que a toString
        System.out.println(Arrays.deepToString(carsMultiDimencional));


        /* Constantes */
        //final transforma uma variavel em constante
        final double taxaJuros = 11.92;
        System.out.println(taxaJuros);

        /* Operadores */
        //realizando um casting que seria transformar numeros em doubles
        double a = (double)4 / (double)3;

        int a2 = 4;
        a++;//incremento
        a--;//decremento

        System.out.println(a);
        System.out.println(a2);


        /* Ordem dos operadores */
        //1º parenteses()
        //2º multiplicação, Divisão
        //3º Soma, Subtração

        int b =  6 + 2 * 2;
        int c =  6 + 2 * (2 - 3);

        System.out.println(b);
        System.out.println(c);


        /* Conversão de Tipos */
        String valorProduto = "10";
        //Integer.parseInt() é uma função que converte string para inteiro
        int valorTotal = Integer.parseInt(valorProduto) + 2;


        System.out.println(valorTotal);


        /* Classe MATH */
        double value = Math.round(10.2);//round arredondamento misto cima/baixo
        double value2 = Math.round(10.2);//ceil arredondamento para cima
        double value3 = Math.floor(10.2);//floor arredondamento para baixo
        double value4 = Math.random() ;//random gera numeros randomicos
        double value5 = Math.random() * 100 ;//random gera numeros randomicos multiplicados por 100
        double value6 = Math.round(Math.random() * 100) ;//random gera numeros randomicos multiplicados por 100 e no final gera um arredondamento
        int value7 = (int)Math.round(Math.random() * 100) ;//random gera numeros randomicos multiplicados por 100 e no final gera um arredondamento e força a ser inteiro





        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);
        System.out.println(value6);
        System.out.println(value7);
    }
}